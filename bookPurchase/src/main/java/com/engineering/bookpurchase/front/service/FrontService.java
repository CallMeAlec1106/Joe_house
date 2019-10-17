package com.engineering.bookpurchase.front.service;

import com.engineering.bookpurchase.front.pojo.User;

public interface FrontService {

    //用户登录
    User LoginUser(String username, String password);

    //添加用户
    int registerUser(User user);
}
