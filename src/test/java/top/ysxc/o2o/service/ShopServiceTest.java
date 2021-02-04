package top.ysxc.o2o.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.ysxc.o2o.BaseTest;
import top.ysxc.o2o.dto.ImageHolder;
import top.ysxc.o2o.dto.ShopExecution;
import top.ysxc.o2o.entity.Area;
import top.ysxc.o2o.entity.PersonInfo;
import top.ysxc.o2o.entity.Shop;
import top.ysxc.o2o.entity.ShopCategory;
import top.ysxc.o2o.enums.ShopStateEnum;
import top.ysxc.o2o.exceptions.ShopOperationException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author ysxc
 * @create 2021-01-14 7:52 下午
 */
public class ShopServiceTest extends BaseTest {

    @Autowired
    private ShopService shopService;

    @Test
    public void testModifyShop() throws ShopOperationException, FileNotFoundException {
        Shop shop = new Shop();
        shop.setShopId(1L);
        shop.setShopName("修改后的店铺名称");
        File shopImg = new File("/Users/xiaochengsong/Downloads/2.jpeg");
        InputStream is = new FileInputStream(shopImg);
        ImageHolder imageHolder = new ImageHolder(shopImg.getName(), is);
        ShopExecution shopExecution = shopService.modifyShop(shop, imageHolder);
        System.out.println("新的图片地址为：" + shopExecution.getShop().getShopImg());
    }

    @Test
    public void testAddShop() throws ShopOperationException, FileNotFoundException {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺3");
        shop.setShopDesc("test3");
        shop.setShopAddr("test3");
        shop.setPhone("test3");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("审核中");
        File shopImg = new File("/Users/xiaochengsong/Downloads/1.jpeg");
        InputStream is = new FileInputStream(shopImg);
        ImageHolder imageHolder = new ImageHolder(shopImg.getName(), is);
        ShopExecution se = shopService.addShop(shop, imageHolder );
        assertEquals(ShopStateEnum.CHECK.getState(), se.getState());
    }
}
