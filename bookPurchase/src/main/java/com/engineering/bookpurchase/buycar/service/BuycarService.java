package com.engineering.bookpurchase.buycar.service;

import com.engineering.bookpurchase.buycar.pojo.BookBuycar;
import com.engineering.bookpurchase.buycar.pojo.BookBuycarExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuycarService {

    public int insert(BookBuycar bookBuycar);

    public List<BookBuycar> selectByExample(Integer consumerid);

    public int deleteByPrimaryKey(Integer buycarId);

    public List<BookBuycar> selectBuycarBook(Integer bookid,Integer userId);

    public int updateByPrimaryKeySelective(BookBuycar record);

    public int updateBuycarStatue(BookBuycar record);
}
