package com.engineering.bookpurchase.common.service.imp;

import com.engineering.bookpurchase.common.mapper.BookUploadMapper;
import com.engineering.bookpurchase.common.pojo.BookUpload;
import com.engineering.bookpurchase.common.service.UploapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUploapService implements UploapService {

    @Autowired
    private BookUploadMapper bookUploadMapper;

    @Override
    public int insert(BookUpload bookUpload) {
        int number = bookUploadMapper.insert(bookUpload);
        return number;
    }
}