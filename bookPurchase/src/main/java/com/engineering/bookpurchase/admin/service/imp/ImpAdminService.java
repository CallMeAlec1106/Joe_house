package com.engineering.bookpurchase.admin.service.imp;

import com.engineering.bookpurchase.admin.pojo.BookAdmin;
import com.engineering.bookpurchase.admin.mapper.BookAdminMapper;
import com.engineering.bookpurchase.admin.pojo.BookAdminExample;
import com.engineering.bookpurchase.admin.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpAdminService implements AdminService {

    @Autowired
    private BookAdminMapper bookAdminMapper;

    @Override
    public List<BookAdmin> selectAdmin(int limit,int page) {
        List<BookAdmin> bookAdmins = bookAdminMapper.selectByExample(limit,page);
        //List<BookAdmin> bookAdmins = bookAdminMapper.selectByExample();
        return bookAdmins;
    }

    @Override
    public int selectAdminCount() {
        int selectAdminCount = bookAdminMapper.selectAdminCount();
        return selectAdminCount;
    }

    @Override
    public BookAdmin loginAdmin(@Param("username") String username, @Param("password") String password) {
        BookAdmin bookAdmin = bookAdminMapper.loginAdmin(username, password);
        return bookAdmin;
    }

    @Override
    public Integer addAdmin(String username, String password) {
        int i = bookAdminMapper.addAdmin(username, password);
        return i;
    }

    @Override
    public Integer deleteAdmin(Integer adminID) {
        return bookAdminMapper.deleteAdmin(adminID);
    }

    @Override
    public List<BookAdmin> searchByAdmin(String username) {
        List<BookAdmin> list = bookAdminMapper.searchByAdmin(username);
        return list;
    }

    @Override
    public BookAdmin selectByPrimaryKey(Integer adminID) {
        BookAdmin bookAdmin = bookAdminMapper.selectByPrimaryKey(adminID);
        return bookAdmin;
    }

    @Override
    public int updateBookAdmin(BookAdmin bookAdmin) {
        int updateCount = bookAdminMapper.updateBookAdmin(bookAdmin);
        return updateCount;
    }
}