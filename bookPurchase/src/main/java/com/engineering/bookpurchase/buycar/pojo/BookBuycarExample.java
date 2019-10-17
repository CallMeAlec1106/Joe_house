package com.engineering.bookpurchase.buycar.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookBuycarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookBuycarExample() {
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

        public Criteria andBuycarIdIsNull() {
            addCriterion("buycar_id is null");
            return (Criteria) this;
        }

        public Criteria andBuycarIdIsNotNull() {
            addCriterion("buycar_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuycarIdEqualTo(Integer value) {
            addCriterion("buycar_id =", value, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdNotEqualTo(Integer value) {
            addCriterion("buycar_id <>", value, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdGreaterThan(Integer value) {
            addCriterion("buycar_id >", value, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buycar_id >=", value, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdLessThan(Integer value) {
            addCriterion("buycar_id <", value, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdLessThanOrEqualTo(Integer value) {
            addCriterion("buycar_id <=", value, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdIn(List<Integer> values) {
            addCriterion("buycar_id in", values, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdNotIn(List<Integer> values) {
            addCriterion("buycar_id not in", values, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdBetween(Integer value1, Integer value2) {
            addCriterion("buycar_id between", value1, value2, "buycarId");
            return (Criteria) this;
        }

        public Criteria andBuycarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buycar_id not between", value1, value2, "buycarId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdIsNull() {
            addCriterion("book_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdIsNotNull() {
            addCriterion("book_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdEqualTo(Integer value) {
            addCriterion("book_detail_id =", value, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdNotEqualTo(Integer value) {
            addCriterion("book_detail_id <>", value, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdGreaterThan(Integer value) {
            addCriterion("book_detail_id >", value, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_detail_id >=", value, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdLessThan(Integer value) {
            addCriterion("book_detail_id <", value, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_detail_id <=", value, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdIn(List<Integer> values) {
            addCriterion("book_detail_id in", values, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdNotIn(List<Integer> values) {
            addCriterion("book_detail_id not in", values, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("book_detail_id between", value1, value2, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andBookDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_detail_id not between", value1, value2, "bookDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityIsNull() {
            addCriterion("order_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityIsNotNull() {
            addCriterion("order_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityEqualTo(String value) {
            addCriterion("order_quantity =", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityNotEqualTo(String value) {
            addCriterion("order_quantity <>", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityGreaterThan(String value) {
            addCriterion("order_quantity >", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("order_quantity >=", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityLessThan(String value) {
            addCriterion("order_quantity <", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityLessThanOrEqualTo(String value) {
            addCriterion("order_quantity <=", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityLike(String value) {
            addCriterion("order_quantity like", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityNotLike(String value) {
            addCriterion("order_quantity not like", value, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityIn(List<String> values) {
            addCriterion("order_quantity in", values, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityNotIn(List<String> values) {
            addCriterion("order_quantity not in", values, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityBetween(String value1, String value2) {
            addCriterion("order_quantity between", value1, value2, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderQuantityNotBetween(String value1, String value2) {
            addCriterion("order_quantity not between", value1, value2, "orderQuantity");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(String value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(String value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(String value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(String value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(String value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLike(String value) {
            addCriterion("total_price like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotLike(String value) {
            addCriterion("total_price not like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<String> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<String> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(String value1, String value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(String value1, String value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateIsNull() {
            addCriterion("updata_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdataDateIsNotNull() {
            addCriterion("updata_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdataDateEqualTo(String value) {
            addCriterion("updata_date =", value, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateNotEqualTo(String value) {
            addCriterion("updata_date <>", value, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateGreaterThan(String value) {
            addCriterion("updata_date >", value, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateGreaterThanOrEqualTo(String value) {
            addCriterion("updata_date >=", value, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateLessThan(String value) {
            addCriterion("updata_date <", value, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateLessThanOrEqualTo(String value) {
            addCriterion("updata_date <=", value, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateLike(String value) {
            addCriterion("updata_date like", value, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateNotLike(String value) {
            addCriterion("updata_date not like", value, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateIn(List<String> values) {
            addCriterion("updata_date in", values, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateNotIn(List<String> values) {
            addCriterion("updata_date not in", values, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateBetween(String value1, String value2) {
            addCriterion("updata_date between", value1, value2, "updataDate");
            return (Criteria) this;
        }

        public Criteria andUpdataDateNotBetween(String value1, String value2) {
            addCriterion("updata_date not between", value1, value2, "updataDate");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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