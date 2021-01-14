package top.ysxc.o2o.dao;

import top.ysxc.o2o.entity.Shop;

/**
 * @author ysxc
 * @create 2021-01-13 3:34 下午
 */
public interface ShopDao {

    /**
     * 新增店铺
     *
     * @param shop
     * @return
     */
    int insertShop(Shop shop);

    /**
     * 更新店铺信息
     *
     * @param shop
     * @return
     */
    int updateShop(Shop shop);
}
