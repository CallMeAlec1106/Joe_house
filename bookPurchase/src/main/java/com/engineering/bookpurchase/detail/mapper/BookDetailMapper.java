package com.engineering.bookpurchase.detail.mapper;

import com.engineering.bookpurchase.detail.pojo.BookDetail;
import com.engineering.bookpurchase.detail.pojo.BookDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface BookDetailMapper {
    int countByExample(BookDetailExample var1);

    int deleteByExample(BookDetailExample var1);

    int deleteByPrimaryKey(Integer var1);

    boolean deleteSelectByPrimaryKey(List delList);

    int insert(BookDetail var1);

    //查询所有的书籍
    List<BookDetail> selectAllBook();

    int insertSelective(BookDetail var1);

    List<BookDetail> selectByExample(@Param("limit")Integer limit,@Param("page")Integer page);

    int selectDetailCount();

    BookDetail selectByPrimaryKey(Integer var1);

    //前台页面查询书籍
    List<BookDetail> searchByBookName(@Param("bookname")String bookname);

    /**
     * 查询书的详情以及图片
     * @return
     */
    public BookDetail selectDetailByBookId(@RequestParam("bookid")Integer bookid);

    List<BookDetail> searchByBook(@Param("bookname")String bookname,@Param("author")String author);

    int searchByBookCount();

    int updateByExampleSelective(@Param("record") BookDetail var1, @Param("example") BookDetailExample var2);

    int updateByExample(@Param("record") BookDetail var1, @Param("example") BookDetailExample var2);

    int updateByPrimaryKeySelective(BookDetail var1);

    int updateByPrimaryKey(BookDetail var1);
}
