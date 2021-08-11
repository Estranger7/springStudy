package com.estranger.www.bean;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/10 20:52
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
