package com.amarsoft.impl;

import org.springframework.stereotype.Component;

/**
 * @author mjwang
 * @version 1.0
 * @date 2021/4/2 21:51
 */
@Component
public class People {

    public String getPeople(String name){

        System.out.println("方法内："+name);

        return name;
    }
}
