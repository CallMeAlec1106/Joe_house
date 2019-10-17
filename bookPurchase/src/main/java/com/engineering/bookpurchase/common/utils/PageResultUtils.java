package com.engineering.bookpurchase.common.utils;

import java.io.Serializable;
import java.util.List;

public class PageResultUtils<T> implements Serializable {
    //起始页
    public int page;
    //显示数量
    public int limit;
    //数据数量
    public int count;
    //代码
    String code;
    //信息
    String msg;
    //返回数据
    List<T> data;
    T example;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
