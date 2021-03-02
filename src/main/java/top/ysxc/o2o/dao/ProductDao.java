package top.ysxc.o2o.dao;

import org.apache.ibatis.annotations.Param;
import top.ysxc.o2o.entity.Product;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-17 9:04 下午
 */
public interface ProductDao {

    List<Product> queryProductList(@Param("productCondition") Product productCondition, @Param("rowIndex") int rowIndex,
                                   @Param("pageSize") int pageSize);

    int queryProductCount(@Param("productCondition") Product productCondition);

    /**
     * 插入商品
     *
     * @param product
     * @return
     */
    int insertProduct(Product product);

    Product queryProductById(long productId);

    int updateProduct(Product product);

    int updateProductCategoryToNull(long productCategoryId);
}
