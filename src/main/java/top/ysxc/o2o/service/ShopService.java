package top.ysxc.o2o.service;

import top.ysxc.o2o.dto.ImageHolder;
import top.ysxc.o2o.dto.ShopExecution;
import top.ysxc.o2o.entity.Shop;
import top.ysxc.o2o.exceptions.ShopOperationException;

import java.io.File;
import java.io.InputStream;

/**
 * @author ysxc
 * @create 2021-01-14 7:53 下午
 */
public interface ShopService {

    ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);

    Shop getByShopId(long shopId);

    ShopExecution modifyShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

    ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
}
