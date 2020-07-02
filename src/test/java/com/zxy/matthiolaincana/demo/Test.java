package com.zxy.matthiolaincana.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/6/11 15:39
 * @Description:
 */
public class Test {


    Logger log = LoggerFactory.getLogger(Test.class);

    @org.junit.Test
    public void test() {
        log.debug("草到底什么是规律111");
        log.info("测试logstash-filter规则1" + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        log.error("测试logstash-filter规则1" + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        log.warn("测试logstash-filter规则1" + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
