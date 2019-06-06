package com.zxdy.model;

import java.util.ArrayList;
import java.util.List;

public class DyApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DyApplyExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("AID not between", value1, value2, "aid");
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

        public Criteria andAreasonIsNull() {
            addCriterion("AReason is null");
            return (Criteria) this;
        }

        public Criteria andAreasonIsNotNull() {
            addCriterion("AReason is not null");
            return (Criteria) this;
        }

        public Criteria andAreasonEqualTo(String value) {
            addCriterion("AReason =", value, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonNotEqualTo(String value) {
            addCriterion("AReason <>", value, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonGreaterThan(String value) {
            addCriterion("AReason >", value, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonGreaterThanOrEqualTo(String value) {
            addCriterion("AReason >=", value, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonLessThan(String value) {
            addCriterion("AReason <", value, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonLessThanOrEqualTo(String value) {
            addCriterion("AReason <=", value, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonLike(String value) {
            addCriterion("AReason like", value, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonNotLike(String value) {
            addCriterion("AReason not like", value, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonIn(List<String> values) {
            addCriterion("AReason in", values, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonNotIn(List<String> values) {
            addCriterion("AReason not in", values, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonBetween(String value1, String value2) {
            addCriterion("AReason between", value1, value2, "areason");
            return (Criteria) this;
        }

        public Criteria andAreasonNotBetween(String value1, String value2) {
            addCriterion("AReason not between", value1, value2, "areason");
            return (Criteria) this;
        }

        public Criteria andAflagIsNull() {
            addCriterion("AFlag is null");
            return (Criteria) this;
        }

        public Criteria andAflagIsNotNull() {
            addCriterion("AFlag is not null");
            return (Criteria) this;
        }

        public Criteria andAflagEqualTo(Integer value) {
            addCriterion("AFlag =", value, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagNotEqualTo(Integer value) {
            addCriterion("AFlag <>", value, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagGreaterThan(Integer value) {
            addCriterion("AFlag >", value, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("AFlag >=", value, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagLessThan(Integer value) {
            addCriterion("AFlag <", value, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagLessThanOrEqualTo(Integer value) {
            addCriterion("AFlag <=", value, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagIn(List<Integer> values) {
            addCriterion("AFlag in", values, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagNotIn(List<Integer> values) {
            addCriterion("AFlag not in", values, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagBetween(Integer value1, Integer value2) {
            addCriterion("AFlag between", value1, value2, "aflag");
            return (Criteria) this;
        }

        public Criteria andAflagNotBetween(Integer value1, Integer value2) {
            addCriterion("AFlag not between", value1, value2, "aflag");
            return (Criteria) this;
        }

        public Criteria andAstatusIsNull() {
            addCriterion("AStatus is null");
            return (Criteria) this;
        }

        public Criteria andAstatusIsNotNull() {
            addCriterion("AStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAstatusEqualTo(String value) {
            addCriterion("AStatus =", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotEqualTo(String value) {
            addCriterion("AStatus <>", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusGreaterThan(String value) {
            addCriterion("AStatus >", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusGreaterThanOrEqualTo(String value) {
            addCriterion("AStatus >=", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusLessThan(String value) {
            addCriterion("AStatus <", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusLessThanOrEqualTo(String value) {
            addCriterion("AStatus <=", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusLike(String value) {
            addCriterion("AStatus like", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotLike(String value) {
            addCriterion("AStatus not like", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusIn(List<String> values) {
            addCriterion("AStatus in", values, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotIn(List<String> values) {
            addCriterion("AStatus not in", values, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusBetween(String value1, String value2) {
            addCriterion("AStatus between", value1, value2, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotBetween(String value1, String value2) {
            addCriterion("AStatus not between", value1, value2, "astatus");
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