package com.wjh.learn.bean.config;

import com.wjh.learn.bean.domain.SpringLifeCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wjh
 * @date 2019/9/2 22:35
 */
@Configuration
public class SpringLifeCycleConfig {

    @Bean(name = "springLifeCycle", initMethod = "start", destroyMethod = "destroy")
    public SpringLifeCycle springLifeCycle() {
        return new SpringLifeCycle();
    }
}
