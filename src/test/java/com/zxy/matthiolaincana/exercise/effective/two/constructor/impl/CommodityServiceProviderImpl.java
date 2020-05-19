package com.zxy.matthiolaincana.exercise.effective.two.constructor.impl;

import com.zxy.matthiolaincana.exercise.effective.two.constructor.ICommodityServiceProvider;
import com.zxy.matthiolaincana.exercise.effective.two.constructor.ICommodityStore;
import com.zxy.matthiolaincana.exercise.effective.two.constructor.ServiceManager;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/19 15:13
 * @Description:
 */
public class CommodityServiceProviderImpl implements ICommodityServiceProvider {
    static {
        ServiceManager.registerService("幸福家园", new CommodityServiceProviderImpl());
    }

    @Override
    public ICommodityStore buySomething() {

        return new CommodityStoreImpl();
    }
}
