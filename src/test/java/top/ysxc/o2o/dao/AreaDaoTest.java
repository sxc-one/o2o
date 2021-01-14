package top.ysxc.o2o.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.ysxc.o2o.BaseTest;
import top.ysxc.o2o.entity.Area;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author ysxc
 * @create 2021-01-10 4:27 下午
 */
public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2,areaList.size());
    }
}
