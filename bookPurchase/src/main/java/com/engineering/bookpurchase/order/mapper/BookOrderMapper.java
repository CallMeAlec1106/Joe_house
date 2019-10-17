package com.engineering.bookpurchase.order.mapper;

import com.engineering.bookpurchase.order.pojo.BookOrder;
import com.engineering.bookpurchase.order.pojo.BookOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookOrderMapper {
    int countByExample(BookOrderExample example);

    int deleteByExample(BookOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    boolean deleteSelectByPrimaryKey(List delList);

    int insert(BookOrder record);

    int insertSelective(BookOrder record);

    List<BookOrder> selectByExample(@Param("limit")Integer limit,@Param("page")Integer page);

    int selectOrderCount();

    BookOrder selectByPrimaryKey(Integer orderId);

    //前台页面查询书籍
    List<BookOrder> searchByBookName(@Param("username")String username);

    int updateByExampleSelective(@Param("record") BookOrder record, @Param("example") BookOrderExample example);

    int updateByExample(@Param("record") BookOrder record, @Param("example") BookOrderExample example);

    int updateByPrimaryKeySelective(BookOrder record);

    int updateByPrimaryKey(BookOrder record);
}