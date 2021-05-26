package com.estranger.www.factory.bean;

/**
 * Created by：Estranger
 * Description：TODO
 * Date：2021/5/24 21:28
 */
public abstract class Toy {

    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
