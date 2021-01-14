package top.ysxc.o2o.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.ysxc.o2o.BaseTest;
import top.ysxc.o2o.entity.Area;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author ysxc
 * @create 2021-01-10 5:20 下午
 */
public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西苑", areaList.get(0).getAreaName());
    }
}
