package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:five.properties" })
@ConfigurationProperties("")
public class FiveConfig {

    private String fiveName;

    private String fiveDesc;

    public String getFiveName() {
        return fiveName;
    }

    public void setFiveName(String fiveName) {
        this.fiveName = fiveName;
    }

    public String getFiveDesc() {
        return fiveDesc;
    }

    public void setFiveDesc(String fiveDesc) {
        this.fiveDesc = fiveDesc;
    }
}
