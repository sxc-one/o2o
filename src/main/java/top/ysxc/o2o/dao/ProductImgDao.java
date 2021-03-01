package top.ysxc.o2o.dao;

import top.ysxc.o2o.entity.ProductImg;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-17 9:10 下午
 */
public interface ProductImgDao {

    /**
     * 列出某个商品的详情图列表
     *
     * @param productId
     * @return
     */
    List<ProductImg> queryProductImgList(long productId);

    int batchInsertProductImg(List<ProductImg> productImgList);

    int deleteProductImgByProductId(long productId);
}
