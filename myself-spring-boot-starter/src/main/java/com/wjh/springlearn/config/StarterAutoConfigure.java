package com.wjh.springlearn.config;

import com.wjh.springlearn.domain.StarterExample;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wjh
 * @date 2019/8/29 22:36
 */
@Configuration
@ConditionalOnClass(StarterExample.class)
@EnableConfigurationProperties(StarterProperties.class)
public class StarterAutoConfigure {

    private final StarterProperties starterProperties;

    public StarterAutoConfigure(StarterProperties properties) {
        this.starterProperties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "starter.example", value = "enabled", havingValue = "true")
    public StarterExample starterExample() {
        return new StarterExample(starterProperties.getPrefix(), starterProperties.getSuffix());
    }
}
