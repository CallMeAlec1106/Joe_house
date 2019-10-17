package com.engineering.bookpurchase.user.service;

import com.engineering.bookpurchase.user.pojo.BookUser;

import java.util.List;

public interface UserService {

    //查询所有管理员信息
    public List<BookUser> selectByAllUser(int limit, int page);

    //查询所有用户的条数
    int selectAllUser();

    //添加用户
    int addUser(BookUser bookUser);

    //删除用户
    int deleteByConsumerId(int consumerid);

    //根据id查询用户
    BookUser selectByConsumerId(int consumerid);

    //修改用户
    Integer saveUserEdit(BookUser bookUser);

    //管理员查询
    List<BookUser> searchByUser(String username);
}
