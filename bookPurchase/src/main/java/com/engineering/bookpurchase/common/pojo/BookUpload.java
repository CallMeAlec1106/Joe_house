package com.engineering.bookpurchase.common.pojo;

public class BookUpload {
    private Integer id;

    private String originalFilename;

    private String originalName;

    private String prefix;

    private String renameFilename;

    private String renameName;

    private String filePath;

    private String createData;

    private String updateData;

    private String remarks;

    private String relativePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename == null ? null : originalFilename.trim();
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName == null ? null : originalName.trim();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }

    public String getRenameFilename() {
        return renameFilename;
    }

    public void setRenameFilename(String renameFilename) {
        this.renameFilename = renameFilename == null ? null : renameFilename.trim();
    }

    public String getRenameName() {
        return renameName;
    }

    public void setRenameName(String renameName) {
        this.renameName = renameName == null ? null : renameName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getCreateData() {
        return createData;
    }

    public void setCreateData(String createData) {
        this.createData = createData == null ? null : createData.trim();
    }

    public String getUpdateData() {
        return updateData;
    }

    public void setUpdateData(String updateData) {
        this.updateData = updateData == null ? null : updateData.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }
}