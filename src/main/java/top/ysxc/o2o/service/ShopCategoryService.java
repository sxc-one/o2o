package top.ysxc.o2o.service;

import top.ysxc.o2o.entity.ShopCategory;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-23 5:47 下午
 */
public interface ShopCategoryService {

    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
