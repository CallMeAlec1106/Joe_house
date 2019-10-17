package com.engineering.bookpurchase.type.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookTypeExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<BookTypeExample.Criteria> oredCriteria = new ArrayList();

    public BookTypeExample() {
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return this.orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public List<BookTypeExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(BookTypeExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public BookTypeExample.Criteria or() {
        BookTypeExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public BookTypeExample.Criteria createCriteria() {
        BookTypeExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected BookTypeExample.Criteria createCriteriaInternal() {
        BookTypeExample.Criteria criteria = new BookTypeExample.Criteria();
        return criteria;
    }

    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
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
            return this.condition;
        }

        public Object getValue() {
            return this.value;
        }

        public Object getSecondValue() {
            return this.secondValue;
        }

        public boolean isNoValue() {
            return this.noValue;
        }

        public boolean isSingleValue() {
            return this.singleValue;
        }

        public boolean isBetweenValue() {
            return this.betweenValue;
        }

        public boolean isListValue() {
            return this.listValue;
        }

        public String getTypeHandler() {
            return this.typeHandler;
        }

        protected Criterion(String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }

        }

        protected Criterion(String condition, Object value) {
            this(condition, value, (String)null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, (String)null);
        }
    }

    public static class Criteria extends BookTypeExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<BookTypeExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<BookTypeExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<BookTypeExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new BookTypeExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new BookTypeExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new BookTypeExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public BookTypeExample.Criteria andTypeidIsNull() {
            this.addCriterion("typeID is null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidIsNotNull() {
            this.addCriterion("typeID is not null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidEqualTo(Integer value) {
            this.addCriterion("typeID =", value, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidNotEqualTo(Integer value) {
            this.addCriterion("typeID <>", value, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidGreaterThan(Integer value) {
            this.addCriterion("typeID >", value, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("typeID >=", value, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidLessThan(Integer value) {
            this.addCriterion("typeID <", value, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidLessThanOrEqualTo(Integer value) {
            this.addCriterion("typeID <=", value, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidIn(List<Integer> values) {
            this.addCriterion("typeID in", values, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidNotIn(List<Integer> values) {
            this.addCriterion("typeID not in", values, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidBetween(Integer value1, Integer value2) {
            this.addCriterion("typeID between", value1, value2, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            this.addCriterion("typeID not between", value1, value2, "typeid");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameIsNull() {
            this.addCriterion("typeName is null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameIsNotNull() {
            this.addCriterion("typeName is not null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameEqualTo(String value) {
            this.addCriterion("typeName =", value, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameNotEqualTo(String value) {
            this.addCriterion("typeName <>", value, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameGreaterThan(String value) {
            this.addCriterion("typeName >", value, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameGreaterThanOrEqualTo(String value) {
            this.addCriterion("typeName >=", value, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameLessThan(String value) {
            this.addCriterion("typeName <", value, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameLessThanOrEqualTo(String value) {
            this.addCriterion("typeName <=", value, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameLike(String value) {
            this.addCriterion("typeName like", value, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameNotLike(String value) {
            this.addCriterion("typeName not like", value, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameIn(List<String> values) {
            this.addCriterion("typeName in", values, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameNotIn(List<String> values) {
            this.addCriterion("typeName not in", values, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameBetween(String value1, String value2) {
            this.addCriterion("typeName between", value1, value2, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andTypenameNotBetween(String value1, String value2) {
            this.addCriterion("typeName not between", value1, value2, "typename");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataIsNull() {
            this.addCriterion("create_data is null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataIsNotNull() {
            this.addCriterion("create_data is not null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataEqualTo(String value) {
            this.addCriterion("create_data =", value, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataNotEqualTo(String value) {
            this.addCriterion("create_data <>", value, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataGreaterThan(String value) {
            this.addCriterion("create_data >", value, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataGreaterThanOrEqualTo(String value) {
            this.addCriterion("create_data >=", value, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataLessThan(String value) {
            this.addCriterion("create_data <", value, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataLessThanOrEqualTo(String value) {
            this.addCriterion("create_data <=", value, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataLike(String value) {
            this.addCriterion("create_data like", value, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataNotLike(String value) {
            this.addCriterion("create_data not like", value, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataIn(List<String> values) {
            this.addCriterion("create_data in", values, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataNotIn(List<String> values) {
            this.addCriterion("create_data not in", values, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataBetween(String value1, String value2) {
            this.addCriterion("create_data between", value1, value2, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andCreateDataNotBetween(String value1, String value2) {
            this.addCriterion("create_data not between", value1, value2, "createData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataIsNull() {
            this.addCriterion("updata_data is null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataIsNotNull() {
            this.addCriterion("updata_data is not null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataEqualTo(String value) {
            this.addCriterion("updata_data =", value, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataNotEqualTo(String value) {
            this.addCriterion("updata_data <>", value, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataGreaterThan(String value) {
            this.addCriterion("updata_data >", value, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataGreaterThanOrEqualTo(String value) {
            this.addCriterion("updata_data >=", value, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataLessThan(String value) {
            this.addCriterion("updata_data <", value, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataLessThanOrEqualTo(String value) {
            this.addCriterion("updata_data <=", value, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataLike(String value) {
            this.addCriterion("updata_data like", value, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataNotLike(String value) {
            this.addCriterion("updata_data not like", value, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataIn(List<String> values) {
            this.addCriterion("updata_data in", values, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataNotIn(List<String> values) {
            this.addCriterion("updata_data not in", values, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataBetween(String value1, String value2) {
            this.addCriterion("updata_data between", value1, value2, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andUpdataDataNotBetween(String value1, String value2) {
            this.addCriterion("updata_data not between", value1, value2, "updataData");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksIsNull() {
            this.addCriterion("remarks is null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksIsNotNull() {
            this.addCriterion("remarks is not null");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksEqualTo(String value) {
            this.addCriterion("remarks =", value, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksNotEqualTo(String value) {
            this.addCriterion("remarks <>", value, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksGreaterThan(String value) {
            this.addCriterion("remarks >", value, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksGreaterThanOrEqualTo(String value) {
            this.addCriterion("remarks >=", value, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksLessThan(String value) {
            this.addCriterion("remarks <", value, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksLessThanOrEqualTo(String value) {
            this.addCriterion("remarks <=", value, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksLike(String value) {
            this.addCriterion("remarks like", value, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksNotLike(String value) {
            this.addCriterion("remarks not like", value, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksIn(List<String> values) {
            this.addCriterion("remarks in", values, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksNotIn(List<String> values) {
            this.addCriterion("remarks not in", values, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksBetween(String value1, String value2) {
            this.addCriterion("remarks between", value1, value2, "remarks");
            return (BookTypeExample.Criteria)this;
        }

        public BookTypeExample.Criteria andRemarksNotBetween(String value1, String value2) {
            this.addCriterion("remarks not between", value1, value2, "remarks");
            return (BookTypeExample.Criteria)this;
        }
    }
}