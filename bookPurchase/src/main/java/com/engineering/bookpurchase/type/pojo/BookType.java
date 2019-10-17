package com.engineering.bookpurchase.type.pojo;

public class BookType {
    private Integer typeid;
    private String typename;
    private String createData;
    private String updataData;
    private String remarks;

    public BookType() {
    }

    public Integer getTypeid() {
        return this.typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getCreateData() {
        return this.createData;
    }

    public void setCreateData(String createData) {
        this.createData = createData == null ? null : createData.trim();
    }

    public String getUpdataData() {
        return this.updataData;
    }

    public void setUpdataData(String updataData) {
        this.updataData = updataData == null ? null : updataData.trim();
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}