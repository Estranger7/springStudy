package com.estranger.www.springSPI;

import com.estranger.www.springSPI.dao.DemoDao;
import org.springframework.core.io.support.SpringFactoriesLoader;
import java.util.List;


/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 21:56
 */
public class SpringSpiApplication {

    public static void main(String[] args) {

        //加载类对象
        List<DemoDao> demoDaos = SpringFactoriesLoader.loadFactories(DemoDao.class, SpringSpiApplication.class.getClassLoader());
        demoDaos.forEach(demoDao -> {
            System.out.println(demoDao);
        });

        // -------------分隔符-------------------

        //加载类的全限定类名
        List<String> daoClassNames  = SpringFactoriesLoader.loadFactoryNames(DemoDao.class, SpringSpiApplication.class.getClassLoader());
        daoClassNames.forEach(daoClassName ->{
            System.out.println(daoClassName);
        });
    }
}
