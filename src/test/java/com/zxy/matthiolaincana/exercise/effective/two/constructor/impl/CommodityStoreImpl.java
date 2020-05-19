package com.zxy.matthiolaincana.exercise.effective.two.constructor.impl;

import com.zxy.matthiolaincana.exercise.effective.two.constructor.ICommodityStore;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/19 15:11
 * @Description:
 */
@Slf4j
public class CommodityStoreImpl implements ICommodityStore {

    @Override
    public void buyFish() {
        log.info("买了一条鱼");
    }

    @Override
    public void buyEgg() {
        log.info("买了两个蛋");
    }
}
