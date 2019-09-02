package com.wjh.learn.bean.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wjh
 * @date 2019/9/2 21:39
 */
public class SpringLifeCycle {
    private static final Logger logger = LoggerFactory.getLogger(SpringLifeCycle.class);

    public void start() {
        logger.info("=====> SpringLifeCycle bean start()...");
    }

    public void destroy() {
        logger.info("=====> SpringLifeCycle bean destroy()...");
    }
}
