package com.wjh.learn.bean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author wjh
 * @date 2019/9/4 21:48
 */
@Service
public class AllImpl implements ApplicationContextAware, BeanNameAware,
        BeanFactoryAware, InitializingBean, DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(AllImpl.class);

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("[BeanFactoryAware] setBeanFactory()...");
    }

    @Override
    public void setBeanName(String name) {
        logger.info("[BeanNameAware] setBeanName()...");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("[DisposableBean] destroy()...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("[InitializingBean] afterPropertiesSet()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("[ApplicationContextAware] setApplicationContext()");
    }
}
