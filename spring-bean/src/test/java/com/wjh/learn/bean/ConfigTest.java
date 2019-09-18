package com.wjh.learn.bean;

import com.wjh.learn.bean.config.SpringLifeCycleConfig;
import com.wjh.learn.bean.domain.SpringLifeCycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wjh
 * @date 2019/9/11 22:14
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ConfigTest {

    @Test
    public void config() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringLifeCycleConfig.class);
        SpringLifeCycle bean = context.getBean(SpringLifeCycle.class);
        System.out.println("========");
        bean.start();
    }
}
