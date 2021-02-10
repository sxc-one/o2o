package top.ysxc.o2o.dao;

import org.apache.ibatis.annotations.Param;
import top.ysxc.o2o.entity.Shop;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-13 3:34 下午
 */
public interface ShopDao {

    List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition, @Param("rowIndex") int rowIndex,
                             @Param("pageSize") int pageSize);

    int queryShopCount(@Param("shopCondition") Shop shopCondition);

    Shop queryByShopId(long shopId);
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
