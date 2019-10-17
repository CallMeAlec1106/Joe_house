package com.engineering.bookpurchase.type.service;

import com.engineering.bookpurchase.type.pojo.BookType;

import java.util.List;

public interface TypeService {
    //添加类型
    public int insertType(BookType bookType);

    //查询所有管理员信息，分页效果
    public List<BookType> selectByExample(int limit, int page);
    //查询所有管理员信息
    public List<BookType> selectType();
    //管理员总数
    public int  selectTypeCount();
    //根据id查询类型
    public BookType selectByPrimaryKey(Integer typyID);
    //根据id修改类型
    public int updateByPrimaryKeySelective(BookType bookType);
    //根据id删除类型
    public int deleteByPrimaryKey(Integer typyID);
    //根据id批量删除
    public boolean deleteSelectByPrimaryKey(List delList);
    //根据条件查询类型
    public List<BookType> searchByType(String booktype);
    //根据条件查询类型总数
    public int searchByTypeCount();

}