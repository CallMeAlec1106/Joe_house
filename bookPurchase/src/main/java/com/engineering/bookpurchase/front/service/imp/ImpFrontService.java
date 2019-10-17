package com.engineering.bookpurchase.front.service.imp;

import com.engineering.bookpurchase.front.mapper.FrontMapper;
import com.engineering.bookpurchase.front.pojo.User;
import com.engineering.bookpurchase.front.service.FrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ImpFrontService implements FrontService {

    @Autowired
    private FrontMapper frontMapper;

    @Override
    public User LoginUser(String username, String password) {
        return frontMapper.LoginUser(username, password);
    }

    @Override
    public int registerUser(User user) {
        return frontMapper.registerUser(user);
    }
}
