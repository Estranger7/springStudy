package com.estranger.www.bean;

import org.springframework.stereotype.Component;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/7/5 20:34
 */
@Component
public class Red extends Color{

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                '}';
    }
}
