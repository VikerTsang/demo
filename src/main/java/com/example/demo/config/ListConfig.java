package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
/**
 * 配置类
 * 从配置文件中读取数据映射到list
 * @author eknows
 * @version 1.0
 * @since 2019/2/13 9:34
 */
@Configuration
@ConfigurationProperties(prefix = "test-list") // 不同的配置类，其前缀不能相同
public class ListConfig {
    private List<String> limitSizeList = new ArrayList<>();

    public List<String> getLimitSizeList() {
        return limitSizeList;
    }

    public void setLimitSizeList(List<String> limitSizeList) {
        this.limitSizeList = limitSizeList;
    }
}