package top.ysxc.o2o.service;

import top.ysxc.o2o.dto.AreaExecution;
import top.ysxc.o2o.entity.Area;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-10 5:17 下午
 */
public interface AreaService {

    String AREALISTKEY = "arealist";

    /**
     * 获取区域列表，优先从缓存获取
     *
     * @return
     */
    List<Area> getAreaList();

    /**
     * 增加区域信息
     *
     * @param area
     * @return
     */
    AreaExecution addArea(Area area);

    /**
     * 修改区域信息
     *
     * @param area
     * @return
     */
    AreaExecution modifyArea(Area area);
}
