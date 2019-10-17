package com.engineering.bookpurchase.user.mapper;

import com.engineering.bookpurchase.user.pojo.BookUser;
import com.engineering.bookpurchase.user.pojo.BookUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookUserMapper {
    long countByExample(BookUserExample example);

    int deleteByExample(BookUserExample example);

    int insert(BookUser record);

    int insertSelective(BookUser record);

    List<BookUser> selectByExample(BookUserExample example);

    //查询所有用户
    List<BookUser> selectByAllUser(@Param("limit")Integer limit,@Param("page")Integer page);

    //查询所有用户的条数
    int selectAllUser();

    //添加用户
    int addUser(BookUser bookuser);

    //删除用户
    int deleteByConsumerId(@Param("consumerid")int consumerid);

    //根据id查询用户
    BookUser selectByConsumerId(@Param("consumerid")int consumerid);

    //修改用户
    Integer saveUserEdit(BookUser bookUser);

    //管理员查询
    List<BookUser> searchByUser(@Param("username")String username);

    int updateByExampleSelective(@Param("record") BookUser record, @Param("example") BookUserExample example);

    int updateByExample(@Param("record") BookUser record, @Param("example") BookUserExample example);
}