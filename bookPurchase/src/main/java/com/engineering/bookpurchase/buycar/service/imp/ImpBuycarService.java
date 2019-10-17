package com.engineering.bookpurchase.buycar.service.imp;

import com.engineering.bookpurchase.buycar.mapper.BookBuycarMapper;
import com.engineering.bookpurchase.buycar.pojo.BookBuycar;
import com.engineering.bookpurchase.buycar.pojo.BookBuycarExample;
import com.engineering.bookpurchase.buycar.service.BuycarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpBuycarService implements BuycarService {

    @Autowired
    private BookBuycarMapper bookBuycarMapper;

    @Override
    public int insert(BookBuycar bookBuycar) {
        int number = bookBuycarMapper.insert(bookBuycar);
        return number;
    }

    @Override
    public List<BookBuycar> selectByExample(Integer consumerid) {
        List<BookBuycar> bookBuycars = bookBuycarMapper.selectByExample(consumerid);
        return bookBuycars;
    }

    @Override
    public int deleteByPrimaryKey(Integer buycarId) {
        int number = bookBuycarMapper.deleteByPrimaryKey(buycarId);
        return number;
    }

    @Override
    public List<BookBuycar> selectBuycarBook(Integer bookid,Integer userId) {
        List<BookBuycar> bookBuycars = bookBuycarMapper.selectBuycarBook(bookid,userId);
        return bookBuycars;
    }

    @Override
    public int updateByPrimaryKeySelective(BookBuycar record) {
        int number = bookBuycarMapper.updateByPrimaryKeySelective(record);
        return number;
    }

    @Override
    public int updateBuycarStatue(BookBuycar record) {
        int number = bookBuycarMapper.updateBuycarStatue(record);
        return number;
    }
}