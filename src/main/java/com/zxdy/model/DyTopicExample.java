package com.zxdy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DyTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DyTopicExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTgidIsNull() {
            addCriterion("TGID is null");
            return (Criteria) this;
        }

        public Criteria andTgidIsNotNull() {
            addCriterion("TGID is not null");
            return (Criteria) this;
        }

        public Criteria andTgidEqualTo(Integer value) {
            addCriterion("TGID =", value, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidNotEqualTo(Integer value) {
            addCriterion("TGID <>", value, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidGreaterThan(Integer value) {
            addCriterion("TGID >", value, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TGID >=", value, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidLessThan(Integer value) {
            addCriterion("TGID <", value, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidLessThanOrEqualTo(Integer value) {
            addCriterion("TGID <=", value, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidIn(List<Integer> values) {
            addCriterion("TGID in", values, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidNotIn(List<Integer> values) {
            addCriterion("TGID not in", values, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidBetween(Integer value1, Integer value2) {
            addCriterion("TGID between", value1, value2, "tgid");
            return (Criteria) this;
        }

        public Criteria andTgidNotBetween(Integer value1, Integer value2) {
            addCriterion("TGID not between", value1, value2, "tgid");
            return (Criteria) this;
        }

        public Criteria andTtitleIsNull() {
            addCriterion("TTitle is null");
            return (Criteria) this;
        }

        public Criteria andTtitleIsNotNull() {
            addCriterion("TTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTtitleEqualTo(String value) {
            addCriterion("TTitle =", value, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleNotEqualTo(String value) {
            addCriterion("TTitle <>", value, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleGreaterThan(String value) {
            addCriterion("TTitle >", value, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleGreaterThanOrEqualTo(String value) {
            addCriterion("TTitle >=", value, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleLessThan(String value) {
            addCriterion("TTitle <", value, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleLessThanOrEqualTo(String value) {
            addCriterion("TTitle <=", value, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleLike(String value) {
            addCriterion("TTitle like", value, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleNotLike(String value) {
            addCriterion("TTitle not like", value, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleIn(List<String> values) {
            addCriterion("TTitle in", values, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleNotIn(List<String> values) {
            addCriterion("TTitle not in", values, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleBetween(String value1, String value2) {
            addCriterion("TTitle between", value1, value2, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTtitleNotBetween(String value1, String value2) {
            addCriterion("TTitle not between", value1, value2, "ttitle");
            return (Criteria) this;
        }

        public Criteria andTdateIsNull() {
            addCriterion("TDate is null");
            return (Criteria) this;
        }

        public Criteria andTdateIsNotNull() {
            addCriterion("TDate is not null");
            return (Criteria) this;
        }

        public Criteria andTdateEqualTo(Date value) {
            addCriterion("TDate =", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotEqualTo(Date value) {
            addCriterion("TDate <>", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateGreaterThan(Date value) {
            addCriterion("TDate >", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateGreaterThanOrEqualTo(Date value) {
            addCriterion("TDate >=", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLessThan(Date value) {
            addCriterion("TDate <", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateLessThanOrEqualTo(Date value) {
            addCriterion("TDate <=", value, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateIn(List<Date> values) {
            addCriterion("TDate in", values, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotIn(List<Date> values) {
            addCriterion("TDate not in", values, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateBetween(Date value1, Date value2) {
            addCriterion("TDate between", value1, value2, "tdate");
            return (Criteria) this;
        }

        public Criteria andTdateNotBetween(Date value1, Date value2) {
            addCriterion("TDate not between", value1, value2, "tdate");
            return (Criteria) this;
        }

        public Criteria andTreadcountIsNull() {
            addCriterion("TReadCount is null");
            return (Criteria) this;
        }

        public Criteria andTreadcountIsNotNull() {
            addCriterion("TReadCount is not null");
            return (Criteria) this;
        }

        public Criteria andTreadcountEqualTo(Integer value) {
            addCriterion("TReadCount =", value, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountNotEqualTo(Integer value) {
            addCriterion("TReadCount <>", value, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountGreaterThan(Integer value) {
            addCriterion("TReadCount >", value, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("TReadCount >=", value, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountLessThan(Integer value) {
            addCriterion("TReadCount <", value, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountLessThanOrEqualTo(Integer value) {
            addCriterion("TReadCount <=", value, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountIn(List<Integer> values) {
            addCriterion("TReadCount in", values, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountNotIn(List<Integer> values) {
            addCriterion("TReadCount not in", values, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountBetween(Integer value1, Integer value2) {
            addCriterion("TReadCount between", value1, value2, "treadcount");
            return (Criteria) this;
        }

        public Criteria andTreadcountNotBetween(Integer value1, Integer value2) {
            addCriterion("TReadCount not between", value1, value2, "treadcount");
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