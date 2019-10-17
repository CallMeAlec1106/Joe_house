package com.engineering.bookpurchase.detail.pojo;

import com.engineering.bookpurchase.common.pojo.BookUpload;
import com.engineering.bookpurchase.type.pojo.BookType;

public class BookDetail {
    private Integer bookid;
    private String bookname;
    private String author;
    private String content;
    private String price;
    private String discount;
    private String booktypeid;
    private String bookuploadid;
    private BookType bookType;
    private BookUpload bookUpload;

    public BookDetail() {
    }

    public Integer getBookid() {
        return this.bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return this.bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getDiscount() {
        return this.discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public String getBooktypeid() {
        return this.booktypeid;
    }

    public void setBooktypeid(String booktypeid) {
        this.booktypeid = booktypeid == null ? null : booktypeid.trim();
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getBookuploadid() {
        return bookuploadid;
    }

    public void setBookuploadid(String bookuploadid) {
        this.bookuploadid = bookuploadid;
    }

    public BookUpload getBookUpload() {
        return bookUpload;
    }

    public void setBookUpload(BookUpload bookUpload) {
        this.bookUpload = bookUpload;
    }
}