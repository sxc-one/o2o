package top.ysxc.o2o.dao;

import org.apache.ibatis.annotations.Param;
import top.ysxc.o2o.entity.ShopCategory;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-23 5:28 下午
 */
public interface ShopCategoryDao {

    List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);
}
