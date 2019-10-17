package com.engineering.bookpurchase.type.mapper;

import com.engineering.bookpurchase.type.pojo.BookType;
import com.engineering.bookpurchase.type.pojo.BookTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookTypeMapper {
    int countByExample(BookTypeExample var1);

    int deleteByExample(BookTypeExample var1);

    int deleteByPrimaryKey(Integer var1);

    boolean deleteSelectByPrimaryKey(List delList);

    //添加类型
    int insert(BookType var1);

    int insertSelective(BookType var1);

    List<BookType> selectType();

    List<BookType> selectByExample(@Param("limit")Integer limit,@Param("page")Integer page);

    int selectTypeCount();

    BookType selectByPrimaryKey(Integer var1);

    int updateByExampleSelective(@Param("record") BookType var1, @Param("example") BookTypeExample var2);

    int updateByExample(@Param("record") BookType var1, @Param("example") BookTypeExample var2);

    int updateByPrimaryKeySelective(BookType var1);

    int updateByPrimaryKey(BookType var1);

    List<BookType> searchByType(@Param("booktype")String booktype);

    int searchByTypeCount();
}