package com.wjh.springlearn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wjh
 * @date 2019/8/29 22:35
 */
@ConfigurationProperties(prefix = "starter.example")
public class StarterProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
