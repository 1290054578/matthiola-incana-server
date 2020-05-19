package com.zxy.matthiolaincana.exercise.effective.two.constructor;


/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/19 15:34
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.zxy.matthiolaincana.exercise.effective.two.constructor.impl.CommodityServiceProviderImpl");
        ICommodityStore iCommodityStore = ServiceManager.getService("幸福家园");
        iCommodityStore.buyEgg();
        iCommodityStore.buyFish();

        Class.forName("com.zxy.matthiolaincana.exercise.effective.two.constructor.impl.CommodityOtherServiceProviderImpl");
        ICommodityStore iCommodityStoreOther = ServiceManager.getService("芙蓉世纪城");
        iCommodityStoreOther.buyEgg();
        iCommodityStoreOther.buyFish();
    }
}
