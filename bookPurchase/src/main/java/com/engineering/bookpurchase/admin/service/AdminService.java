package com.engineering.bookpurchase.admin.service;

import com.engineering.bookpurchase.admin.pojo.BookAdmin;
import com.engineering.bookpurchase.admin.pojo.BookAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminService {

    //查询所有管理员信息
    public List<BookAdmin> selectAdmin(int limit,int page);
    //管理员总数
    public int  selectAdminCount();
    //管理员登录
    BookAdmin loginAdmin(String username, String password);

    //管理员添加
    Integer addAdmin(String username,  String password);

    //管理员删除
    Integer deleteAdmin(Integer adminID);

    //管理员查询
    List<BookAdmin> searchByAdmin(String username);

    BookAdmin selectByPrimaryKey(Integer adminID);

    int updateBookAdmin(BookAdmin bookAdmin);
}