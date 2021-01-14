package top.ysxc.o2o.service;

import top.ysxc.o2o.entity.Area;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-10 5:17 下午
 */
public interface AreaService {

    /**
     * 获取区域列表，优先从缓存获取
     *
     * @return
     */
    List<Area> getAreaList();
}
