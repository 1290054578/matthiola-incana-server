package com.zxy.matthiolaincana.exercise.effective.two.constructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/19 15:20
 * @Description:
 */
public class ServiceManager {
    private static final Map<String, ICommodityServiceProvider> providers = new HashMap<>();

    public static void registerService(String name, ICommodityServiceProvider iCommodityServiceProvider) {
        providers.put(name, iCommodityServiceProvider);
    }

    public static ICommodityStore getService(String name) {
        ICommodityServiceProvider iCommodityServiceProvider = providers.get(name);
        return iCommodityServiceProvider.buySomething();
    }

}
