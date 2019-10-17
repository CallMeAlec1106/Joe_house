package com.engineering.bookpurchase.common.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookUploadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookUploadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameIsNull() {
            addCriterion("original_filename is null");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameIsNotNull() {
            addCriterion("original_filename is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameEqualTo(String value) {
            addCriterion("original_filename =", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameNotEqualTo(String value) {
            addCriterion("original_filename <>", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameGreaterThan(String value) {
            addCriterion("original_filename >", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("original_filename >=", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameLessThan(String value) {
            addCriterion("original_filename <", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameLessThanOrEqualTo(String value) {
            addCriterion("original_filename <=", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameLike(String value) {
            addCriterion("original_filename like", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameNotLike(String value) {
            addCriterion("original_filename not like", value, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameIn(List<String> values) {
            addCriterion("original_filename in", values, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameNotIn(List<String> values) {
            addCriterion("original_filename not in", values, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameBetween(String value1, String value2) {
            addCriterion("original_filename between", value1, value2, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalFilenameNotBetween(String value1, String value2) {
            addCriterion("original_filename not between", value1, value2, "originalFilename");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIsNull() {
            addCriterion("original_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIsNotNull() {
            addCriterion("original_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalNameEqualTo(String value) {
            addCriterion("original_name =", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotEqualTo(String value) {
            addCriterion("original_name <>", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameGreaterThan(String value) {
            addCriterion("original_name >", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameGreaterThanOrEqualTo(String value) {
            addCriterion("original_name >=", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLessThan(String value) {
            addCriterion("original_name <", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLessThanOrEqualTo(String value) {
            addCriterion("original_name <=", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLike(String value) {
            addCriterion("original_name like", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotLike(String value) {
            addCriterion("original_name not like", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIn(List<String> values) {
            addCriterion("original_name in", values, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotIn(List<String> values) {
            addCriterion("original_name not in", values, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameBetween(String value1, String value2) {
            addCriterion("original_name between", value1, value2, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotBetween(String value1, String value2) {
            addCriterion("original_name not between", value1, value2, "originalName");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("prefix is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("prefix is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("prefix =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("prefix <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("prefix >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("prefix >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("prefix <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("prefix <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("prefix like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("prefix not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("prefix in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("prefix not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("prefix between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("prefix not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameIsNull() {
            addCriterion("rename_filename is null");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameIsNotNull() {
            addCriterion("rename_filename is not null");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameEqualTo(String value) {
            addCriterion("rename_filename =", value, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameNotEqualTo(String value) {
            addCriterion("rename_filename <>", value, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameGreaterThan(String value) {
            addCriterion("rename_filename >", value, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("rename_filename >=", value, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameLessThan(String value) {
            addCriterion("rename_filename <", value, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameLessThanOrEqualTo(String value) {
            addCriterion("rename_filename <=", value, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameLike(String value) {
            addCriterion("rename_filename like", value, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameNotLike(String value) {
            addCriterion("rename_filename not like", value, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameIn(List<String> values) {
            addCriterion("rename_filename in", values, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameNotIn(List<String> values) {
            addCriterion("rename_filename not in", values, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameBetween(String value1, String value2) {
            addCriterion("rename_filename between", value1, value2, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameFilenameNotBetween(String value1, String value2) {
            addCriterion("rename_filename not between", value1, value2, "renameFilename");
            return (Criteria) this;
        }

        public Criteria andRenameNameIsNull() {
            addCriterion("rename_name is null");
            return (Criteria) this;
        }

        public Criteria andRenameNameIsNotNull() {
            addCriterion("rename_name is not null");
            return (Criteria) this;
        }

        public Criteria andRenameNameEqualTo(String value) {
            addCriterion("rename_name =", value, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameNotEqualTo(String value) {
            addCriterion("rename_name <>", value, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameGreaterThan(String value) {
            addCriterion("rename_name >", value, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameGreaterThanOrEqualTo(String value) {
            addCriterion("rename_name >=", value, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameLessThan(String value) {
            addCriterion("rename_name <", value, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameLessThanOrEqualTo(String value) {
            addCriterion("rename_name <=", value, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameLike(String value) {
            addCriterion("rename_name like", value, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameNotLike(String value) {
            addCriterion("rename_name not like", value, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameIn(List<String> values) {
            addCriterion("rename_name in", values, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameNotIn(List<String> values) {
            addCriterion("rename_name not in", values, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameBetween(String value1, String value2) {
            addCriterion("rename_name between", value1, value2, "renameName");
            return (Criteria) this;
        }

        public Criteria andRenameNameNotBetween(String value1, String value2) {
            addCriterion("rename_name not between", value1, value2, "renameName");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andCreateDataIsNull() {
            addCriterion("create_data is null");
            return (Criteria) this;
        }

        public Criteria andCreateDataIsNotNull() {
            addCriterion("create_data is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDataEqualTo(String value) {
            addCriterion("create_data =", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotEqualTo(String value) {
            addCriterion("create_data <>", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataGreaterThan(String value) {
            addCriterion("create_data >", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataGreaterThanOrEqualTo(String value) {
            addCriterion("create_data >=", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLessThan(String value) {
            addCriterion("create_data <", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLessThanOrEqualTo(String value) {
            addCriterion("create_data <=", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLike(String value) {
            addCriterion("create_data like", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotLike(String value) {
            addCriterion("create_data not like", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataIn(List<String> values) {
            addCriterion("create_data in", values, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotIn(List<String> values) {
            addCriterion("create_data not in", values, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataBetween(String value1, String value2) {
            addCriterion("create_data between", value1, value2, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotBetween(String value1, String value2) {
            addCriterion("create_data not between", value1, value2, "createData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataIsNull() {
            addCriterion("update_data is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDataIsNotNull() {
            addCriterion("update_data is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDataEqualTo(String value) {
            addCriterion("update_data =", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataNotEqualTo(String value) {
            addCriterion("update_data <>", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataGreaterThan(String value) {
            addCriterion("update_data >", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataGreaterThanOrEqualTo(String value) {
            addCriterion("update_data >=", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataLessThan(String value) {
            addCriterion("update_data <", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataLessThanOrEqualTo(String value) {
            addCriterion("update_data <=", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataLike(String value) {
            addCriterion("update_data like", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataNotLike(String value) {
            addCriterion("update_data not like", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataIn(List<String> values) {
            addCriterion("update_data in", values, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataNotIn(List<String> values) {
            addCriterion("update_data not in", values, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataBetween(String value1, String value2) {
            addCriterion("update_data between", value1, value2, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataNotBetween(String value1, String value2) {
            addCriterion("update_data not between", value1, value2, "updateData");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}