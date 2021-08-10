package com.estranger.www.bean;

import org.springframework.stereotype.Component;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/7/5 21:06
 */
public class Dog extends Animal{

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
