package com.wjh.learn.bean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @author wjh
 * @date 2019/9/2 21:38
 */
@Service
public class SpringLifeCycleService implements InitializingBean, DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(SpringLifeCycleService.class);

    public SpringLifeCycleService() {
        logger.info("====> SpringLifeCycleService constructor...");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("====> DisposableBean destroy()...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("====> InitializingBean afterPropertiesSet()...");
    }
}
