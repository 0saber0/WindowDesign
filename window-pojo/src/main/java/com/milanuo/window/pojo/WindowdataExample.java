package com.milanuo.window.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WindowdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WindowdataExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInputheightIsNull() {
            addCriterion("inputHeight is null");
            return (Criteria) this;
        }

        public Criteria andInputheightIsNotNull() {
            addCriterion("inputHeight is not null");
            return (Criteria) this;
        }

        public Criteria andInputheightEqualTo(Integer value) {
            addCriterion("inputHeight =", value, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightNotEqualTo(Integer value) {
            addCriterion("inputHeight <>", value, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightGreaterThan(Integer value) {
            addCriterion("inputHeight >", value, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightGreaterThanOrEqualTo(Integer value) {
            addCriterion("inputHeight >=", value, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightLessThan(Integer value) {
            addCriterion("inputHeight <", value, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightLessThanOrEqualTo(Integer value) {
            addCriterion("inputHeight <=", value, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightIn(List<Integer> values) {
            addCriterion("inputHeight in", values, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightNotIn(List<Integer> values) {
            addCriterion("inputHeight not in", values, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightBetween(Integer value1, Integer value2) {
            addCriterion("inputHeight between", value1, value2, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputheightNotBetween(Integer value1, Integer value2) {
            addCriterion("inputHeight not between", value1, value2, "inputheight");
            return (Criteria) this;
        }

        public Criteria andInputwidthIsNull() {
            addCriterion("inputWidth is null");
            return (Criteria) this;
        }

        public Criteria andInputwidthIsNotNull() {
            addCriterion("inputWidth is not null");
            return (Criteria) this;
        }

        public Criteria andInputwidthEqualTo(Integer value) {
            addCriterion("inputWidth =", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthNotEqualTo(Integer value) {
            addCriterion("inputWidth <>", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthGreaterThan(Integer value) {
            addCriterion("inputWidth >", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("inputWidth >=", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthLessThan(Integer value) {
            addCriterion("inputWidth <", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthLessThanOrEqualTo(Integer value) {
            addCriterion("inputWidth <=", value, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthIn(List<Integer> values) {
            addCriterion("inputWidth in", values, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthNotIn(List<Integer> values) {
            addCriterion("inputWidth not in", values, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthBetween(Integer value1, Integer value2) {
            addCriterion("inputWidth between", value1, value2, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("inputWidth not between", value1, value2, "inputwidth");
            return (Criteria) this;
        }

        public Criteria andInputnumberIsNull() {
            addCriterion("inputNumber is null");
            return (Criteria) this;
        }

        public Criteria andInputnumberIsNotNull() {
            addCriterion("inputNumber is not null");
            return (Criteria) this;
        }

        public Criteria andInputnumberEqualTo(Integer value) {
            addCriterion("inputNumber =", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberNotEqualTo(Integer value) {
            addCriterion("inputNumber <>", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberGreaterThan(Integer value) {
            addCriterion("inputNumber >", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("inputNumber >=", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberLessThan(Integer value) {
            addCriterion("inputNumber <", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberLessThanOrEqualTo(Integer value) {
            addCriterion("inputNumber <=", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberIn(List<Integer> values) {
            addCriterion("inputNumber in", values, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberNotIn(List<Integer> values) {
            addCriterion("inputNumber not in", values, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberBetween(Integer value1, Integer value2) {
            addCriterion("inputNumber between", value1, value2, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("inputNumber not between", value1, value2, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeIsNull() {
            addCriterion("materialsType is null");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeIsNotNull() {
            addCriterion("materialsType is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeEqualTo(String value) {
            addCriterion("materialsType =", value, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeNotEqualTo(String value) {
            addCriterion("materialsType <>", value, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeGreaterThan(String value) {
            addCriterion("materialsType >", value, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeGreaterThanOrEqualTo(String value) {
            addCriterion("materialsType >=", value, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeLessThan(String value) {
            addCriterion("materialsType <", value, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeLessThanOrEqualTo(String value) {
            addCriterion("materialsType <=", value, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeLike(String value) {
            addCriterion("materialsType like", value, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeNotLike(String value) {
            addCriterion("materialsType not like", value, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeIn(List<String> values) {
            addCriterion("materialsType in", values, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeNotIn(List<String> values) {
            addCriterion("materialsType not in", values, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeBetween(String value1, String value2) {
            addCriterion("materialsType between", value1, value2, "materialstype");
            return (Criteria) this;
        }

        public Criteria andMaterialstypeNotBetween(String value1, String value2) {
            addCriterion("materialsType not between", value1, value2, "materialstype");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMemorydateIsNull() {
            addCriterion("memoryDate is null");
            return (Criteria) this;
        }

        public Criteria andMemorydateIsNotNull() {
            addCriterion("memoryDate is not null");
            return (Criteria) this;
        }

        public Criteria andMemorydateEqualTo(Date value) {
            addCriterion("memoryDate =", value, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateNotEqualTo(Date value) {
            addCriterion("memoryDate <>", value, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateGreaterThan(Date value) {
            addCriterion("memoryDate >", value, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateGreaterThanOrEqualTo(Date value) {
            addCriterion("memoryDate >=", value, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateLessThan(Date value) {
            addCriterion("memoryDate <", value, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateLessThanOrEqualTo(Date value) {
            addCriterion("memoryDate <=", value, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateIn(List<Date> values) {
            addCriterion("memoryDate in", values, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateNotIn(List<Date> values) {
            addCriterion("memoryDate not in", values, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateBetween(Date value1, Date value2) {
            addCriterion("memoryDate between", value1, value2, "memorydate");
            return (Criteria) this;
        }

        public Criteria andMemorydateNotBetween(Date value1, Date value2) {
            addCriterion("memoryDate not between", value1, value2, "memorydate");
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