package top.ysxc.o2o.dao;

import org.apache.ibatis.annotations.Param;
import top.ysxc.o2o.entity.ProductCategory;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-14 9:21 下午
 */
public interface ProductCategoryDao {

    /**
     * 通过shop id 查询店铺商品类别
     *
     * @param shopId
     * @return List<ProductCategory>
     */
    List<ProductCategory> queryProductCategoryList(long shopId);

    /**
     * 批量新增商品类别
     *
     * @param productCategoryList
     * @return
     */
    int batchInsertProductCategory(List<ProductCategory> productCategoryList);

    /**
     * 删除指定商品类别
     *
     * @param productCategoryId
     * @param shopId
     * @return effectedNum
     */
    int deleteProductCategory(@Param("productCategoryId") long productCategoryId, @Param("shopId") long shopId);
}
