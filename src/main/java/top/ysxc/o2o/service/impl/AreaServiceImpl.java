package top.ysxc.o2o.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.ysxc.o2o.cache.JedisUtil;
import top.ysxc.o2o.dao.AreaDao;
import top.ysxc.o2o.entity.Area;
import top.ysxc.o2o.exceptions.AreaOperationException;
import top.ysxc.o2o.service.AreaService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-10 5:18 下午
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Autowired
    private JedisUtil.Keys jedisKeys;

    @Autowired
    private JedisUtil.Strings jedisStrings;

    private static Logger logger = LoggerFactory.getLogger(AreaServiceImpl.class);

    @Override
    @Transactional
    public List<Area> getAreaList() {
        String key = AREALISTKEY;
        List<Area> areaList = null;
        ObjectMapper mapper = new ObjectMapper();
        if (!jedisKeys.exists(key)) {
            areaList = areaDao.queryArea();
            String jsonString;
            try {
                jsonString = mapper.writeValueAsString(areaList);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                logger.error(e.getMessage());
                throw new AreaOperationException(e.getMessage());
            }
            jedisStrings.set(key, jsonString);
        } else {
            String jsonString = jedisStrings.get(key);
            JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, Area.class);
            try {
                areaList = mapper.readValue(jsonString, javaType);
            } catch (IOException e) {
                e.printStackTrace();
                logger.error(e.getMessage());
                throw new AreaOperationException(e.getMessage());
            }
        }
        return areaList;
    }
}
