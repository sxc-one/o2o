package top.ysxc.o2o.dao;

import org.apache.ibatis.annotations.Param;
import top.ysxc.o2o.entity.ProductCategory;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-14 9:21 下午
 */
public interface ProductCategoryDao {

    List<ProductCategory> queryProductCategoryList(long shopId);

    int batchInsertProductCategory(List<ProductCategory> productCategoryList);

    int deleteProductCategory(@Param("productCategoryId") long productCategoryId, @Param("shopId") long shopId);
}
