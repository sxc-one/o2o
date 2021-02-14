package top.ysxc.o2o.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ysxc.o2o.dao.ProductCategoryDao;
import top.ysxc.o2o.entity.ProductCategory;
import top.ysxc.o2o.service.ProductCategoryService;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-14 9:32 下午
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategory> getProductCategoryList(long shopId) {
        return productCategoryDao.queryProductCategoryList(shopId);
    }
}
