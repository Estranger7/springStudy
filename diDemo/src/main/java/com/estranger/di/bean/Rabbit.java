package com.estranger.di.bean;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/17 21:19
 */
public class Rabbit {
    private String name;

    private Integer age;

    public Rabbit(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
