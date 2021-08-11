package com.estranger.www.jdkSPI;

import com.estranger.www.jdkSPI.dao.DemoDao;

import java.util.ServiceLoader;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 21:56
 */
public class JdkSpiApplication {

    public static void main(String[] args) {
        ServiceLoader<DemoDao> serviceLoader = ServiceLoader.load(DemoDao.class);
        serviceLoader.iterator().forEachRemaining(demoDao -> {
            System.out.println(demoDao);
        });
    }
}
