package com.wjh.learn.bean;

import com.wjh.springlearn.domain.StarterExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wjh
 * @date 2019/9/1 17:04
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StarterExampleTest {

    @Autowired
    private StarterExample starterExample;

    @Test
    public void starterExample() {
        if (starterExample != null) {
            System.out.println(starterExample.adapter("hello starter..."));
        } else {
            System.out.println("is null");
        }
    }
}
