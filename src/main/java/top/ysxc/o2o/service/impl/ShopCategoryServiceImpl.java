package top.ysxc.o2o.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.ysxc.o2o.dao.ShopCategoryDao;
import top.ysxc.o2o.entity.ShopCategory;
import top.ysxc.o2o.service.ShopCategoryService;

import java.util.List;

/**
 * @author ysxc
 * @create 2021-01-23 5:48 下午
 */
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {

    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Override
    public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {

        return shopCategoryDao.queryShopCategory(shopCategoryCondition);
    }
}
