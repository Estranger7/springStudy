package service.impl;


import dao.DemoDao;
import factory.BeanFactory;
import service.DemoService;

import java.util.List;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/10 20:56
 */
public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
