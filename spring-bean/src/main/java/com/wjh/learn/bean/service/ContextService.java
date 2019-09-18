package com.wjh.learn.bean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author wjh
 * @date 2019/9/3 22:20
 */
@Service
public class ContextService implements ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(ContextService.class);
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String applicationName = applicationContext.getApplicationName();
        String displayName = applicationContext.getDisplayName();
        logger.info("====> ContextService setApplicationContext()...applicationName = {}," +
                "displayName = {}", applicationName, displayName);
    }
}
