package com.engineering.bookpurchase.buycar.pojo;

import com.engineering.bookpurchase.common.pojo.BookUpload;
import com.engineering.bookpurchase.detail.pojo.BookDetail;
import com.engineering.bookpurchase.front.pojo.User;
import com.engineering.bookpurchase.user.pojo.BookUser;

public class BookBuycar {
    private Integer buycarId;

    private Integer userId;

    private Integer bookDetailId;

    private String orderQuantity;

    private String totalPrice;

    private String createDate;

    private String updataDate;

    private String remarks;

    private String status;

    private User user;

    private BookUser bookUser;

    private BookDetail bookDetail;

    private BookUpload bookUpload;

    public Integer getBuycarId() {
        return buycarId;
    }

    public void setBuycarId(Integer buycarId) {
        this.buycarId = buycarId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookDetailId() {
        return bookDetailId;
    }

    public void setBookDetailId(Integer bookDetailId) {
        this.bookDetailId = bookDetailId;
    }

    public String getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity == null ? null : orderQuantity.trim();
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getUpdataDate() {
        return updataDate;
    }

    public void setUpdataDate(String updataDate) {
        this.updataDate = updataDate == null ? null : updataDate.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(BookDetail bookDetail) {
        this.bookDetail = bookDetail;
    }

    public BookUser getBookUser() {
        return bookUser;
    }

    public void setBookUser(BookUser bookUser) {
        this.bookUser = bookUser;
    }

    public BookUpload getBookUpload() {
        return bookUpload;
    }

    public void setBookUpload(BookUpload bookUpload) {
        this.bookUpload = bookUpload;
    }
}