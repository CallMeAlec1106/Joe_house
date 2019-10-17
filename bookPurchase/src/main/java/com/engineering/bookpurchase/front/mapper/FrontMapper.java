package com.engineering.bookpurchase.front.mapper;

import com.engineering.bookpurchase.front.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FrontMapper {

    //用户登录
    User LoginUser(@Param("username") String username, @Param("password") String password);

    //添加用户
    int registerUser(User user);
}
