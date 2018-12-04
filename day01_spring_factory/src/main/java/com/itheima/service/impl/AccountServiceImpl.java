package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;


/**
 * 业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
   private IAccountDao accountDao = new AccountDaoImpl();

    public void findAll() {
        accountDao.findAll();
    }
}
