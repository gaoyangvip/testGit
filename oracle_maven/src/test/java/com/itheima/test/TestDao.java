package com.itheima.test;

import com.itheima.dao.IItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.IItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {

    @Test
    public void findById1(){
        //读取配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取代理对象
        IItemsDao iItemsDao = ac.getBean(IItemsDao.class);

        //调用方法
        Items items = iItemsDao.findById(1);

        System.out.println(items.getName());
    }

    @Test
    public void findById2(){
        //读取配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取代理对象
        IItemsService iItemsService= ac.getBean(IItemsService.class);

        //调用方法
        Items items = iItemsService.findById(1);

        System.out.println(items.getName());
    }
}
