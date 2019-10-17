package com.engineering.bookpurchase.type.service.imp;

import com.engineering.bookpurchase.type.mapper.BookTypeMapper;
import com.engineering.bookpurchase.type.pojo.BookType;
import com.engineering.bookpurchase.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpTypeService implements TypeService {

    @Autowired
    private BookTypeMapper bookTypeMapper;
    
    @Override
    public int insertType(BookType bookType) {
        int number = bookTypeMapper.insert(bookType);
        return number;
    }

    @Override
    public List<BookType> selectByExample(int limit, int page) {
        List<BookType> bookTypes = bookTypeMapper.selectByExample(limit, page);
        return bookTypes;
    }

    @Override
    public int selectTypeCount() {
        int number = bookTypeMapper.selectTypeCount();
        return number;
    }

    @Override
    public BookType selectByPrimaryKey(Integer typyID) {
        BookType bookType = bookTypeMapper.selectByPrimaryKey(typyID);
        return bookType;
    }

    @Override
    public int updateByPrimaryKeySelective(BookType bookType) {
        int number = bookTypeMapper.updateByPrimaryKeySelective(bookType);
        return number;
    }

    @Override
    public int deleteByPrimaryKey(Integer typyID) {
        int number = bookTypeMapper.deleteByPrimaryKey(typyID);
        return number;
    }

    @Override
    public List<BookType> selectType() {
        List<BookType> bookTypes = bookTypeMapper.selectType();
        return bookTypes;
    }

    @Override
    public boolean deleteSelectByPrimaryKey(List delList) {
        boolean flg = bookTypeMapper.deleteSelectByPrimaryKey(delList);
        return flg;
    }

    @Override
    public List<BookType> searchByType(String booktype) {
        List<BookType> bookTypes = bookTypeMapper.searchByType(booktype);
        return bookTypes;
    }

    @Override
    public int searchByTypeCount() {
        int number = bookTypeMapper.searchByTypeCount();
        return number;
    }
}