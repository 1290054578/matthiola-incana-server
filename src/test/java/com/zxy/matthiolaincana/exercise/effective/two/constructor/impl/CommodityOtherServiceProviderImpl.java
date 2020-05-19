package com.zxy.matthiolaincana.exercise.effective.two.constructor.impl;

import com.zxy.matthiolaincana.exercise.effective.two.constructor.ICommodityServiceProvider;
import com.zxy.matthiolaincana.exercise.effective.two.constructor.ICommodityStore;
import com.zxy.matthiolaincana.exercise.effective.two.constructor.ServiceManager;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/19 16:07
 * @Description:
 */
public class CommodityOtherServiceProviderImpl implements ICommodityServiceProvider {
    static {
        ServiceManager.registerService("芙蓉世纪城", new CommodityOtherServiceProviderImpl());
    }

    @Override
    public ICommodityStore buySomething() {
        return new CommodityStoreOthersImpl();
    }
}
