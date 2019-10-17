package com.engineering.bookpurchase.common.mapper;

import com.engineering.bookpurchase.common.pojo.BookUpload;
import com.engineering.bookpurchase.common.pojo.BookUploadExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookUploadMapper {
    int countByExample(BookUploadExample example);

    int deleteByExample(BookUploadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookUpload record);

    int insertSelective(BookUpload record);

    List<BookUpload> selectByExample(BookUploadExample example);

    BookUpload selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookUpload record, @Param("example") BookUploadExample example);

    int updateByExample(@Param("record") BookUpload record, @Param("example") BookUploadExample example);

    int updateByPrimaryKeySelective(BookUpload record);

    int updateByPrimaryKey(BookUpload record);
}