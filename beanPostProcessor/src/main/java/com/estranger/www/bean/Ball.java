package com.estranger.www.bean;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/28 21:20
 */
public class Ball {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "id='" + id + '\'' +
                '}';
    }
}
