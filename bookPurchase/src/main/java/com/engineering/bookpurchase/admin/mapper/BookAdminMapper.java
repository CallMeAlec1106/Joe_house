package com.engineering.bookpurchase.admin.mapper;

import com.engineering.bookpurchase.admin.pojo.BookAdmin;
import com.engineering.bookpurchase.admin.pojo.BookAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookAdminMapper {
    int countByExample(BookAdminExample example);

    int deleteByExample(BookAdminExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(BookAdmin record);

    int insertSelective(BookAdmin record);

    //查询所有管理员
    List<BookAdmin> selectByExample(@Param("limit")Integer limit,@Param("page")Integer page);

    //查询管理员总数
    int selectAdminCount();

    //管理员登录
    BookAdmin loginAdmin(@Param("username") String username, @Param("password") String password);

    //管理员添加
    Integer addAdmin(@Param("username") String username, @Param("password") String password);

    List<BookAdmin> selectByExample2();

    //根据id查询管理员
    BookAdmin selectByPrimaryKey(@Param("adminID")Integer adminID);

    //根据id删除管理员
    Integer deleteAdmin(@Param("adminID")Integer adminID);

    //管理员查询
    List<BookAdmin> searchByAdmin(@Param("username")String username);

    int updateByExampleSelective(@Param("record") BookAdmin record, @Param("example") BookAdminExample example);

    int updateByExample(@Param("record") BookAdmin record, @Param("example") BookAdminExample example);

    //修改管理员信息
    int updateBookAdmin(@Param("bookAdmin") BookAdmin bookAdmin);

    int updateByPrimaryKeySelective(BookAdmin record);

    int updateByPrimaryKey(BookAdmin record);

    void selectByExample();
}