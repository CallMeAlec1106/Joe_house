package com.engineering.bookpurchase.detail.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookDetailExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria = new ArrayList();

    public BookDetailExample() {
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

    public List<Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
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

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public Criteria andBookidIsNull() {
            this.addCriterion("bookID is null");
            return (Criteria)this;
        }

        public Criteria andBookidIsNotNull() {
            this.addCriterion("bookID is not null");
            return (Criteria)this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            this.addCriterion("bookID =", value, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            this.addCriterion("bookID <>", value, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            this.addCriterion("bookID >", value, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("bookID >=", value, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidLessThan(Integer value) {
            this.addCriterion("bookID <", value, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            this.addCriterion("bookID <=", value, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            this.addCriterion("bookID in", values, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            this.addCriterion("bookID not in", values, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            this.addCriterion("bookID between", value1, value2, "bookid");
            return (Criteria)this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            this.addCriterion("bookID not between", value1, value2, "bookid");
            return (Criteria)this;
        }

        public Criteria andBooknameIsNull() {
            this.addCriterion("bookName is null");
            return (Criteria)this;
        }

        public Criteria andBooknameIsNotNull() {
            this.addCriterion("bookName is not null");
            return (Criteria)this;
        }

        public Criteria andBooknameEqualTo(String value) {
            this.addCriterion("bookName =", value, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            this.addCriterion("bookName <>", value, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            this.addCriterion("bookName >", value, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            this.addCriterion("bookName >=", value, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameLessThan(String value) {
            this.addCriterion("bookName <", value, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            this.addCriterion("bookName <=", value, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameLike(String value) {
            this.addCriterion("bookName like", value, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameNotLike(String value) {
            this.addCriterion("bookName not like", value, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameIn(List<String> values) {
            this.addCriterion("bookName in", values, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            this.addCriterion("bookName not in", values, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            this.addCriterion("bookName between", value1, value2, "bookname");
            return (Criteria)this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            this.addCriterion("bookName not between", value1, value2, "bookname");
            return (Criteria)this;
        }

        public Criteria andAuthorIsNull() {
            this.addCriterion("author is null");
            return (Criteria)this;
        }

        public Criteria andAuthorIsNotNull() {
            this.addCriterion("author is not null");
            return (Criteria)this;
        }

        public Criteria andAuthorEqualTo(String value) {
            this.addCriterion("author =", value, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            this.addCriterion("author <>", value, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            this.addCriterion("author >", value, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            this.addCriterion("author >=", value, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorLessThan(String value) {
            this.addCriterion("author <", value, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            this.addCriterion("author <=", value, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorLike(String value) {
            this.addCriterion("author like", value, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorNotLike(String value) {
            this.addCriterion("author not like", value, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorIn(List<String> values) {
            this.addCriterion("author in", values, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            this.addCriterion("author not in", values, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            this.addCriterion("author between", value1, value2, "author");
            return (Criteria)this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            this.addCriterion("author not between", value1, value2, "author");
            return (Criteria)this;
        }

        public Criteria andContentIsNull() {
            this.addCriterion("content is null");
            return (Criteria)this;
        }

        public Criteria andContentIsNotNull() {
            this.addCriterion("content is not null");
            return (Criteria)this;
        }

        public Criteria andContentEqualTo(String value) {
            this.addCriterion("content =", value, "content");
            return (Criteria)this;
        }

        public Criteria andContentNotEqualTo(String value) {
            this.addCriterion("content <>", value, "content");
            return (Criteria)this;
        }

        public Criteria andContentGreaterThan(String value) {
            this.addCriterion("content >", value, "content");
            return (Criteria)this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            this.addCriterion("content >=", value, "content");
            return (Criteria)this;
        }

        public Criteria andContentLessThan(String value) {
            this.addCriterion("content <", value, "content");
            return (Criteria)this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            this.addCriterion("content <=", value, "content");
            return (Criteria)this;
        }

        public Criteria andContentLike(String value) {
            this.addCriterion("content like", value, "content");
            return (Criteria)this;
        }

        public Criteria andContentNotLike(String value) {
            this.addCriterion("content not like", value, "content");
            return (Criteria)this;
        }

        public Criteria andContentIn(List<String> values) {
            this.addCriterion("content in", values, "content");
            return (Criteria)this;
        }

        public Criteria andContentNotIn(List<String> values) {
            this.addCriterion("content not in", values, "content");
            return (Criteria)this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            this.addCriterion("content between", value1, value2, "content");
            return (Criteria)this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            this.addCriterion("content not between", value1, value2, "content");
            return (Criteria)this;
        }

        public Criteria andPriceIsNull() {
            this.addCriterion("price is null");
            return (Criteria)this;
        }

        public Criteria andPriceIsNotNull() {
            this.addCriterion("price is not null");
            return (Criteria)this;
        }

        public Criteria andPriceEqualTo(String value) {
            this.addCriterion("price =", value, "price");
            return (Criteria)this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            this.addCriterion("price <>", value, "price");
            return (Criteria)this;
        }

        public Criteria andPriceGreaterThan(String value) {
            this.addCriterion("price >", value, "price");
            return (Criteria)this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            this.addCriterion("price >=", value, "price");
            return (Criteria)this;
        }

        public Criteria andPriceLessThan(String value) {
            this.addCriterion("price <", value, "price");
            return (Criteria)this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            this.addCriterion("price <=", value, "price");
            return (Criteria)this;
        }

        public Criteria andPriceLike(String value) {
            this.addCriterion("price like", value, "price");
            return (Criteria)this;
        }

        public Criteria andPriceNotLike(String value) {
            this.addCriterion("price not like", value, "price");
            return (Criteria)this;
        }

        public Criteria andPriceIn(List<String> values) {
            this.addCriterion("price in", values, "price");
            return (Criteria)this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            this.addCriterion("price not in", values, "price");
            return (Criteria)this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            this.addCriterion("price between", value1, value2, "price");
            return (Criteria)this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            this.addCriterion("price not between", value1, value2, "price");
            return (Criteria)this;
        }

        public Criteria andDiscountIsNull() {
            this.addCriterion("discount is null");
            return (Criteria)this;
        }

        public Criteria andDiscountIsNotNull() {
            this.addCriterion("discount is not null");
            return (Criteria)this;
        }

        public Criteria andDiscountEqualTo(String value) {
            this.addCriterion("discount =", value, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountNotEqualTo(String value) {
            this.addCriterion("discount <>", value, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountGreaterThan(String value) {
            this.addCriterion("discount >", value, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(String value) {
            this.addCriterion("discount >=", value, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountLessThan(String value) {
            this.addCriterion("discount <", value, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountLessThanOrEqualTo(String value) {
            this.addCriterion("discount <=", value, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountLike(String value) {
            this.addCriterion("discount like", value, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountNotLike(String value) {
            this.addCriterion("discount not like", value, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountIn(List<String> values) {
            this.addCriterion("discount in", values, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountNotIn(List<String> values) {
            this.addCriterion("discount not in", values, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountBetween(String value1, String value2) {
            this.addCriterion("discount between", value1, value2, "discount");
            return (Criteria)this;
        }

        public Criteria andDiscountNotBetween(String value1, String value2) {
            this.addCriterion("discount not between", value1, value2, "discount");
            return (Criteria)this;
        }

        public Criteria andBooktypeidIsNull() {
            this.addCriterion("bookTypeID is null");
            return (Criteria)this;
        }

        public Criteria andBooktypeidIsNotNull() {
            this.addCriterion("bookTypeID is not null");
            return (Criteria)this;
        }

        public Criteria andBooktypeidEqualTo(String value) {
            this.addCriterion("bookTypeID =", value, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidNotEqualTo(String value) {
            this.addCriterion("bookTypeID <>", value, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidGreaterThan(String value) {
            this.addCriterion("bookTypeID >", value, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidGreaterThanOrEqualTo(String value) {
            this.addCriterion("bookTypeID >=", value, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidLessThan(String value) {
            this.addCriterion("bookTypeID <", value, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidLessThanOrEqualTo(String value) {
            this.addCriterion("bookTypeID <=", value, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidLike(String value) {
            this.addCriterion("bookTypeID like", value, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidNotLike(String value) {
            this.addCriterion("bookTypeID not like", value, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidIn(List<String> values) {
            this.addCriterion("bookTypeID in", values, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidNotIn(List<String> values) {
            this.addCriterion("bookTypeID not in", values, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidBetween(String value1, String value2) {
            this.addCriterion("bookTypeID between", value1, value2, "booktypeid");
            return (Criteria)this;
        }

        public Criteria andBooktypeidNotBetween(String value1, String value2) {
            this.addCriterion("bookTypeID not between", value1, value2, "booktypeid");
            return (Criteria)this;
        }
    }
}