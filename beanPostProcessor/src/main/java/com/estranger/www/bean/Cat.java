package com.estranger.www.bean;

import org.springframework.stereotype.Component;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/28 20:30
 */
@Component
public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
