package com.engineering.bookpurchase.user.service.imp;

import com.engineering.bookpurchase.user.mapper.BookUserMapper;
import com.engineering.bookpurchase.user.pojo.BookUser;
import com.engineering.bookpurchase.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpUserService implements UserService {

    @Autowired
    private BookUserMapper bookUserMapper;

    @Override
    public List<BookUser> selectByAllUser(int limit, int page) {
        return bookUserMapper.selectByAllUser(limit,page);
    }

    @Override
    public int selectAllUser() {
        return bookUserMapper.selectAllUser();
    }

    @Override
    public int addUser(BookUser bookUser) {
        return bookUserMapper.addUser(bookUser);
    }

    @Override
    public int deleteByConsumerId(int consumerid) {
        return bookUserMapper.deleteByConsumerId(consumerid);
    }

    @Override
    public BookUser selectByConsumerId(int consumerid) {
        return bookUserMapper.selectByConsumerId(consumerid);
    }

    @Override
    public Integer saveUserEdit(BookUser bookUser) {
        return bookUserMapper.saveUserEdit(bookUser);
    }

    @Override
    public List<BookUser> searchByUser(String username) {
        return bookUserMapper.searchByUser(username);
    }
}
