package com.estranger.www.factory;

import com.estranger.www.factory.bean.Ball;
import com.estranger.www.factory.bean.Car;
import com.estranger.www.factory.bean.Child;
import com.estranger.www.factory.bean.Toy;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * Created by：Estranger
 * Description：TODO
 * Date：2021/5/24 21:33
 */
public class ToyFactoryBean implements FactoryBean<Toy>{

    private Child child;

    @Nullable
    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                // SpringFramework2.0开始允许返回null
                // 之前的1.x版本是不允许的
                return null;
        }
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
