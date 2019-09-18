package com.wjh.learn.bean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * @author wjh
 * @date 2019/9/2 21:43
 */
@Service("spring-bean-service")
public class SpringBeanService implements BeanFactoryAware, BeanNameAware {
    private static final Logger logger = LoggerFactory.getLogger(SpringBeanService.class);

    private BeanFactory beanFactory;

    public SpringBeanService() {
        logger.info("====> SpringBeanService constructor...");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        logger.info("====> BeanFactoryAware setBeanFactory()...");
    }

    @Override
    public void setBeanName(String name) {
        logger.info("====> BeanNameAware setBeanName()...bean name is {}", name);
    }

}
