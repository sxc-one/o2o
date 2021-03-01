package top.ysxc.o2o.dao;

import top.ysxc.o2o.entity.Product;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-17 9:04 下午
 */
public interface ProductDao {
    /**
     * 插入商品
     *
     * @param product
     * @return
     */
    int insertProduct(Product product);

    Product queryProductById(long productId);

    int updateProduct(Product product);
}
