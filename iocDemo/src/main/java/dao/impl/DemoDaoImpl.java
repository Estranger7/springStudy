package dao.impl;


import dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/5/10 20:55
 */
public class DemoDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        // 此处应该是访问数据库的操作，用临时数据代替
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}