package top.ysxc.o2o.dao;

import top.ysxc.o2o.entity.Area;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-10 4:23 下午
 */
public interface AreaDao {
    /**
     * 列出区域列表
     *
     * @return areaList
     */
    List<Area> queryArea();
}
