package top.ysxc.o2o.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ysxc.o2o.dao.AreaDao;
import top.ysxc.o2o.entity.Area;
import top.ysxc.o2o.service.AreaService;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-10 5:18 下午
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
