package top.ysxc.o2o.service;

import top.ysxc.o2o.dto.ImageHolder;
import top.ysxc.o2o.dto.ProductExecution;
import top.ysxc.o2o.entity.Product;
import top.ysxc.o2o.exceptions.ProductOperationException;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-17 9:43 下午
 */
public interface ProductService {

    ProductExecution addProduct(Product product, ImageHolder thumbnail, List<ImageHolder> productImgList)
        throws ProductOperationException;
}
