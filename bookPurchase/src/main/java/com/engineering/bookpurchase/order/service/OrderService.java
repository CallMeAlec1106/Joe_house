package com.engineering.bookpurchase.order.service;

import com.engineering.bookpurchase.order.pojo.BookOrder;

import java.util.List;

public interface OrderService {

    public int insert(BookOrder bookOrder);

    public List<BookOrder> selectByExample(Integer limit,Integer page);

    public int selectOrderCount();

    public int deleteByPrimaryKey(Integer orderId);

    public boolean deleteSelectByPrimaryKey(List delList);

}
