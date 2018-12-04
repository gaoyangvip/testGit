package com.itheima.service.impl;

import com.itheima.dao.IItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements IItemsService {
    @Autowired
    private IItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
