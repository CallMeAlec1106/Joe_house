package com.engineering.bookpurchase.detail.service.imp;

import com.engineering.bookpurchase.detail.mapper.BookDetailMapper;
import com.engineering.bookpurchase.detail.pojo.BookDetail;
import com.engineering.bookpurchase.detail.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ImpDetailService implements DetailService {

    @Autowired
    private BookDetailMapper bookDetailMapper;

    @Override
    public List<BookDetail> selectByExample(int limit, int page) {
        List<BookDetail> bookDetails = bookDetailMapper.selectByExample(limit, page);
        return bookDetails;
    }

    @Override
    public List<BookDetail> selectAllBook() {
        return bookDetailMapper.selectAllBook();
    }

    @Override
    public List<BookDetail> searchByBookName(String bookname) {
        return bookDetailMapper.searchByBookName(bookname);
    }

    @Override
    public int selectDetailCount() {
        int number = bookDetailMapper.selectDetailCount();
        return number;
    }

    @Override
    public BookDetail selectDetailByBookId(Integer bookid) {
        return bookDetailMapper.selectDetailByBookId(bookid);
    }

    @Override
    public int insert(BookDetail bookDetail) {
        int number = bookDetailMapper.insert(bookDetail);
        return number;
    }

    @Override
    public BookDetail selectByPrimaryKey(int bookid) {
        BookDetail bookDetail = bookDetailMapper.selectByPrimaryKey(bookid);
        return bookDetail;
    }

    @Override
    public int updateByPrimaryKey(BookDetail bookDetail) {
        int number = bookDetailMapper.updateByPrimaryKey(bookDetail);
        return number;
    }

    @Override
    public int deleteByPrimaryKey(Integer bookid) {
        int number = bookDetailMapper.deleteByPrimaryKey(bookid);
        return number;
    }

    @Override
    public boolean deleteSelectByPrimaryKey(List delList) {
        boolean flg = bookDetailMapper.deleteSelectByPrimaryKey(delList);
        return flg;
    }

    @Override
    public List<BookDetail> searchByBook(String bookname, String author) {
        List<BookDetail> bookDetails = bookDetailMapper.searchByBook(bookname, author);
        return bookDetails;
    }

    @Override
    public int searchByBookCount() {
        int number = bookDetailMapper.searchByBookCount();
        return number;
    }
}