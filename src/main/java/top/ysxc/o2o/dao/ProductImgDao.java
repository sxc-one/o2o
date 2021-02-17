package top.ysxc.o2o.dao;

import top.ysxc.o2o.entity.ProductImg;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-17 9:10 下午
 */
public interface ProductImgDao {

    int batchInsertProductImg(List<ProductImg> productImgList);
}
