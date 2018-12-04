package com.itheima.dao;

import com.itheima.domain.Items;

public interface IItemsDao {

    //根据ID查找商品
    public Items findById(Integer id);
}
