package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
       /* System.out.println(111);
        //获取Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(222);
        //根据bean的id获取对象
        IAccountService accountService = (IAccountService)ac.getBean("accountService");
        accountService.findAll();
        System.out.println(accountService);

        IAccountDao accountDao = (IAccountDao)ac.getBean("accountDao");

        System.out.println(accountDao);
        accountDao.findAll();*/


//        IAccountService accountService =(IAccountService) BeanFactory.getBean("accountService");
//        System.out.println(accountService);

        IAccountDao accountDao = (IAccountDao)BeanFactory.getBean("accountDao");
        accountDao.findAll();
    }
}
