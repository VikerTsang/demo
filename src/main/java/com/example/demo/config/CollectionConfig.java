package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@PropertySource(value = { "classpath:demomap.properties" })
@ConfigurationProperties(prefix = "data")
public class CollectionConfig {

    private Map<String, String> person = new HashMap<>();
    private Map<String, String> human = new HashMap<>();

    private List<String> apple = new ArrayList<>();
    private List<String> iphone = new ArrayList<>();

    public Map<String, String> getPerson() {
        return person;
    }

    public void setPerson(Map<String, String> person) {
        this.person = person;
    }

    public Map<String, String> getHuman() {
        return human;
    }

    public void setHuman(Map<String, String> human) {
        this.human = human;
    }

    public List<String> getApple() {
        return apple;
    }

    public void setApple(List<String> apple) {
        this.apple = apple;
    }

    public List<String> getIphone() {
        return iphone;
    }

    public void setIphone(List<String> iphone) {
        this.iphone = iphone;
    }
}