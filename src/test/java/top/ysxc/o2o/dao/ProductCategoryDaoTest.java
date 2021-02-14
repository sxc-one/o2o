package top.ysxc.o2o.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.ysxc.o2o.BaseTest;
import top.ysxc.o2o.entity.ProductCategory;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-02-14 9:30 下午
 */
public class ProductCategoryDaoTest extends BaseTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void testBQueryByShopId() throws Exception {
        long shopId = 1;
        List<ProductCategory> productCategoryList = productCategoryDao.queryProductCategoryList(shopId);
        System.out.println("该店铺自定义类别数为：" + productCategoryList.size());
    }
}
