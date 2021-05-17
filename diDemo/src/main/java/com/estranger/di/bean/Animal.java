package com.estranger.di.bean;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/17 21:07
 */
public class Animal {

    private String name;

    private Integer age;

    private Cat cat;

    private Rabbit rabbit;

    public Animal(Rabbit rabbit) {
        this.rabbit = rabbit;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

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
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                ", rabbit=" + rabbit +
                '}';
    }
}
