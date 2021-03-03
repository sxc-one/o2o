package top.ysxc.o2o.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.ysxc.o2o.BaseTest;
import top.ysxc.o2o.entity.ShopCategory;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author ysxc
 * @create 2021-01-23 5:39 下午
 */
public class ShopCategoryDaoTest extends BaseTest {
    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Test
    public void testQueryShopCategory() {
        List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(null);
        assertEquals(1, shopCategoryList.size());
//        ShopCategory testCategory = new ShopCategory();
//        ShopCategory parentCategory = new ShopCategory();
//        parentCategory.setShopCategoryId(1L);
//        testCategory.setParent(parentCategory);
//        shopCategoryList = shopCategoryDao.queryShopCategory(testCategory);
//        assertEquals(1, shopCategoryList.size());
//        System.out.println(shopCategoryList.get(0).getShopCategoryName());
    }
}
