package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

@Configuration
//@ConfigurationProperties(prefix = "test")
@ConfigurationProperties(prefix = "test")
public class MapConfig {

    /**
     * 从配置文件中读取的limitSizeMap开头的数据
     * 注意：名称必须与配置文件中保持一致
     */
    private Map<String, Integer> limitSizeMap = new HashMap<>();

    public Map<String, Integer> getLimitSizeMap() {
        return limitSizeMap;
    }

    public void setLimitSizeMap(Map<String, Integer> limitSizeMap) {
        this.limitSizeMap = limitSizeMap;
    }
}