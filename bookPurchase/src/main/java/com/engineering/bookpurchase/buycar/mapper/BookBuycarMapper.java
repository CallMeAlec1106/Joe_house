package com.engineering.bookpurchase.buycar.mapper;

import com.engineering.bookpurchase.buycar.pojo.BookBuycar;
import com.engineering.bookpurchase.buycar.pojo.BookBuycarExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookBuycarMapper {
    int countByExample(BookBuycarExample example);

    int deleteByExample(BookBuycarExample example);

    int deleteByPrimaryKey(Integer buycarId);

    int insert(BookBuycar record);

    int insertSelective(BookBuycar record);

    List<BookBuycar> selectByExample(@Param("userId")Integer userId);

    BookBuycar selectByPrimaryKey(Integer buycarId);

    List<BookBuycar> selectBuycarBook(@Param("bookid") Integer bookid,@Param("userId") Integer userId);

    int updateByExampleSelective(@Param("record") BookBuycar record, @Param("example") BookBuycarExample example);

    int updateByExample(@Param("record") BookBuycar record, @Param("example") BookBuycarExample example);

    int updateByPrimaryKeySelective(BookBuycar record);

    int updateByPrimaryKey(BookBuycar record);

    int updateBuycarStatue(BookBuycar record);
}