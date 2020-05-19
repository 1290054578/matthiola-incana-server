package com.zxy.matthiolaincana.exercise.effective.two.constructor.impl;

import com.zxy.matthiolaincana.exercise.effective.two.constructor.ICommodityStore;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/19 16:05
 * @Description:
 */
@Slf4j
public class CommodityStoreOthersImpl implements ICommodityStore {
    @Override
    public void buyFish() {
        log.info("我又买了鱼。通过另一个服务");
    }

    @Override
    public void buyEgg() {
        log.info("我又买了鸡蛋，通过另一个服务");
    }
}
