package com.engineering.bookpurchase.detail.service;

import com.engineering.bookpurchase.detail.pojo.BookDetail;

import java.util.List;

public interface DetailService {
    /**
     * 查看书本信息
     * @param limit
     * @param page
     * @return
     */
    public List<BookDetail> selectByExample(int limit, int page);

    //查询所有书籍
    List<BookDetail> selectAllBook();

    //前台页面查询书籍
    List<BookDetail> searchByBookName(String bookname);

    /**
     * 查看书籍总数
     * @return
     */
    public int selectDetailCount();

    /**
     * 查询书的详情以及图片
     * @return
     */
    public BookDetail selectDetailByBookId(Integer bookid);

    public int insert(BookDetail bookDetail);

    public BookDetail selectByPrimaryKey(int bookid);

    public int updateByPrimaryKey(BookDetail bookDetail);

    public int deleteByPrimaryKey(Integer bookid);

    public boolean deleteSelectByPrimaryKey(List delList);

    public List<BookDetail> searchByBook(String bookname,String author);

    public int searchByBookCount();
}
