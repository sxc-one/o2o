package top.ysxc.o2o.service;

import top.ysxc.o2o.entity.ProductCategory;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-14 9:31 下午
 */
public interface ProductCategoryService {

    List<ProductCategory> getProductCategoryList(long shopId);
}
