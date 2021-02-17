package top.ysxc.o2o.service;

import top.ysxc.o2o.dto.ProductCategoryExecution;
import top.ysxc.o2o.entity.ProductCategory;
import top.ysxc.o2o.exceptions.ProductCategoryOperationException;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-14 9:31 下午
 */
public interface ProductCategoryService {

    List<ProductCategory> getProductCategoryList(long shopId);

    ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
            throws ProductCategoryOperationException;

    /**
     * 将此类别下的商品里的类别id置为空，再删除掉该商品类别
     * @param productCategoryId
     * @param shopId
     * @return
     * @throws RuntimeException
     */
    ProductCategoryExecution deleteProductCategory(long productCategoryId, long shopId)
            throws ProductCategoryOperationException;
}
