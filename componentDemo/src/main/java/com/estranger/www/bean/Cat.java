package com.estranger.www.bean;

import org.springframework.stereotype.Component;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/17 21:07
 */
@Component
public class Cat {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
