package com.amarsoft.AmarPackTest;

import com.amarsoft.impl.People;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author mjwang
 * @version 1.0
 * @date 2021/4/2 21:49
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    People people;

    @org.junit.Test
    public void test(){


        people.getPeople("mj");
        System.out.print(1);
    }
}
