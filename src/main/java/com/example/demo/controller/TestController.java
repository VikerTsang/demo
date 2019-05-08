package com.example.demo.controller;

import com.example.demo.config.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("config")
@Slf4j
public class TestController {

    @Autowired
    private OneConfig oneConfig;

    @Autowired
    private TwoConfig twoConfig;

    @Autowired
    private ThreeConfig threeConfig;

    @Autowired
    private FourConfig fourConfig;

    @Autowired
    private FiveConfig fiveConfig;

    @Autowired
    private ListConfig ListConfig;

    @Autowired
    private MapConfig mapConfig;

    @Autowired
    private CollectionConfig collectionConfig;

    @RequestMapping("/list")
    public void test(){
        log.info("*****************************************************");
        log.info("one, {},{}.", oneConfig.getName(), oneConfig.getDesc());
        log.info("two, {},{}.", twoConfig.getName(), twoConfig.getDesc());
        log.info("three, {},{}.", threeConfig.getName(), threeConfig.getDesc());
        log.info("four, {},{}.", fourConfig.getName(), fourConfig.getDesc());
        log.info("five, {},{}.", fiveConfig.getFiveName(), fiveConfig.getFiveDesc());

        log.info("-----------------------------------------------------");
        Map<String, Integer> limitSizeMap = mapConfig.getLimitSizeMap();
        if (limitSizeMap == null || limitSizeMap.size() <= 0) {
            log.info("limitSizeMap读取失败");
        } else {
            log.info("limitSizeMap读取成功，数据如下：");
            for (String key : limitSizeMap.keySet()) {
                log.info("key: " + key + ", value: " + limitSizeMap.get(key));
            }
        }
        log.info("-----------------------------------------------------");
        Map<String, String> personMap = collectionConfig.getPerson();
        if (personMap == null || personMap.size() <= 0) {
            log.info("person读取失败");
        } else {
            log.info("person读取成功，数据如下：");
            for (String key : personMap.keySet()) {
                log.info("key: " + key + ", value: " + personMap.get(key));
            }
        }
        log.info("-----------------------------------------------------");
        Map<String, String> humanMap = collectionConfig.getHuman();
        if (humanMap == null || humanMap.size() <= 0) {
            log.info("human读取失败");
        } else {
            log.info("human读取成功，数据如下：");
            for (String key : humanMap.keySet()) {
                log.info("key: " + key + ", value: " + humanMap.get(key));
            }
        }
        log.info("-----------------------------------------------------");
        List<String> appleList = collectionConfig.getApple();
        if (appleList == null || appleList.size() <= 0) {
            log.info("appleList读取失败");
        } else {
            log.info("appleList读取成功，数据如下：");
            for (String str : appleList) {
                log.info(str);
            }
        }
        log.info("-----------------------------------------------------");
        List<String> iphoneList = collectionConfig.getIphone();
        if (iphoneList == null || iphoneList.size() <= 0) {
            log.info("iphoneList读取失败");
        } else {
            log.info("iphoneList读取成功，数据如下：");
            for (String str : iphoneList) {
                log.info(str);
            }
        }
        log.info("-----------------------------------------------------");
        List<String> limitSizeList = ListConfig.getLimitSizeList();
        if (limitSizeList == null || limitSizeList.size() <= 0) {
            log.info("limitSizeList读取失败");
        } else {
            log.info("limitSizeList读取成功，数据如下：");
            for (String str : limitSizeList) {
                log.info(str);
            }
        }
        log.info("*****************************************************");
    }


}
