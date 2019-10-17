package com.engineering.bookpurchase.order.service.imp;

import com.engineering.bookpurchase.order.mapper.BookOrderMapper;
import com.engineering.bookpurchase.order.pojo.BookOrder;
import com.engineering.bookpurchase.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpOrderService implements OrderService {

    @Autowired
    private BookOrderMapper bookOrderMapper;

    @Override
    public int insert(BookOrder bookOrder) {
        int number = bookOrderMapper.insert(bookOrder);
        return number;
    }

    @Override
    public List<BookOrder> selectByExample(Integer limit, Integer page) {
        List<BookOrder> bookOrders = bookOrderMapper.selectByExample(limit, page);
        return bookOrders;
    }

    @Override
    public int selectOrderCount() {
        int number = bookOrderMapper.selectOrderCount();
        return number;
    }

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        int number = bookOrderMapper.deleteByPrimaryKey(orderId);
        return number;
    }

    @Override
    public boolean deleteSelectByPrimaryKey(List delList) {
        boolean flg = bookOrderMapper.deleteSelectByPrimaryKey(delList);
        return flg;
    }
}