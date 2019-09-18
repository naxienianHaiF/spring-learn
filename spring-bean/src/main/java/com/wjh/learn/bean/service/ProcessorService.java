package com.wjh.learn.bean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @author wjh
 * @date 2019/9/4 20:53
 */
//@Service
public class ProcessorService implements BeanPostProcessor {
    private static final Logger logger = LoggerFactory.getLogger(ProcessorService.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("spring-bean-service".equals(beanName)){
            logger.info("====> ProcessorService postProcessBeforeInitialization()... bean name is {}", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("spring-bean-service".equals(beanName)){
            logger.info("====> ProcessorService postProcessAfterInitialization()... bean name is {}", beanName);
        }
        return bean;
    }
}
