package top.ysxc.o2o.service;

import top.ysxc.o2o.dto.ImageHolder;
import top.ysxc.o2o.dto.ShopExecution;
import top.ysxc.o2o.entity.Shop;
import top.ysxc.o2o.exceptions.ShopOperationException;

import java.io.File;

/**
 * @author ysxc
 * @create 2021-01-14 7:53 下午
 */
public interface ShopService {

    ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
}
