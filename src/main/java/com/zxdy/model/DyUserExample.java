package com.zxdy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DyUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DyUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUnameIsNull() {
            addCriterion("UName is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("UName is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("UName =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("UName <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("UName >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("UName >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("UName <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("UName <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("UName like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("UName not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("UName in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("UName not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("UName between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("UName not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNull() {
            addCriterion("UPwd is null");
            return (Criteria) this;
        }

        public Criteria andUpwdIsNotNull() {
            addCriterion("UPwd is not null");
            return (Criteria) this;
        }

        public Criteria andUpwdEqualTo(String value) {
            addCriterion("UPwd =", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotEqualTo(String value) {
            addCriterion("UPwd <>", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThan(String value) {
            addCriterion("UPwd >", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdGreaterThanOrEqualTo(String value) {
            addCriterion("UPwd >=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThan(String value) {
            addCriterion("UPwd <", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLessThanOrEqualTo(String value) {
            addCriterion("UPwd <=", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdLike(String value) {
            addCriterion("UPwd like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotLike(String value) {
            addCriterion("UPwd not like", value, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdIn(List<String> values) {
            addCriterion("UPwd in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotIn(List<String> values) {
            addCriterion("UPwd not in", values, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdBetween(String value1, String value2) {
            addCriterion("UPwd between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUpwdNotBetween(String value1, String value2) {
            addCriterion("UPwd not between", value1, value2, "upwd");
            return (Criteria) this;
        }

        public Criteria andUgenderIsNull() {
            addCriterion("UGender is null");
            return (Criteria) this;
        }

        public Criteria andUgenderIsNotNull() {
            addCriterion("UGender is not null");
            return (Criteria) this;
        }

        public Criteria andUgenderEqualTo(String value) {
            addCriterion("UGender =", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotEqualTo(String value) {
            addCriterion("UGender <>", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderGreaterThan(String value) {
            addCriterion("UGender >", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderGreaterThanOrEqualTo(String value) {
            addCriterion("UGender >=", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLessThan(String value) {
            addCriterion("UGender <", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLessThanOrEqualTo(String value) {
            addCriterion("UGender <=", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderLike(String value) {
            addCriterion("UGender like", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotLike(String value) {
            addCriterion("UGender not like", value, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderIn(List<String> values) {
            addCriterion("UGender in", values, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotIn(List<String> values) {
            addCriterion("UGender not in", values, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderBetween(String value1, String value2) {
            addCriterion("UGender between", value1, value2, "ugender");
            return (Criteria) this;
        }

        public Criteria andUgenderNotBetween(String value1, String value2) {
            addCriterion("UGender not between", value1, value2, "ugender");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("UEmail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("UEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("UEmail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("UEmail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("UEmail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("UEmail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("UEmail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("UEmail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("UEmail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("UEmail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("UEmail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("UEmail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("UEmail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("UEmail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUroleIsNull() {
            addCriterion("URole is null");
            return (Criteria) this;
        }

        public Criteria andUroleIsNotNull() {
            addCriterion("URole is not null");
            return (Criteria) this;
        }

        public Criteria andUroleEqualTo(Integer value) {
            addCriterion("URole =", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleNotEqualTo(Integer value) {
            addCriterion("URole <>", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleGreaterThan(Integer value) {
            addCriterion("URole >", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleGreaterThanOrEqualTo(Integer value) {
            addCriterion("URole >=", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleLessThan(Integer value) {
            addCriterion("URole <", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleLessThanOrEqualTo(Integer value) {
            addCriterion("URole <=", value, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleIn(List<Integer> values) {
            addCriterion("URole in", values, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleNotIn(List<Integer> values) {
            addCriterion("URole not in", values, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleBetween(Integer value1, Integer value2) {
            addCriterion("URole between", value1, value2, "urole");
            return (Criteria) this;
        }

        public Criteria andUroleNotBetween(Integer value1, Integer value2) {
            addCriterion("URole not between", value1, value2, "urole");
            return (Criteria) this;
        }

        public Criteria andUheadIsNull() {
            addCriterion("UHead is null");
            return (Criteria) this;
        }

        public Criteria andUheadIsNotNull() {
            addCriterion("UHead is not null");
            return (Criteria) this;
        }

        public Criteria andUheadEqualTo(String value) {
            addCriterion("UHead =", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadNotEqualTo(String value) {
            addCriterion("UHead <>", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadGreaterThan(String value) {
            addCriterion("UHead >", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadGreaterThanOrEqualTo(String value) {
            addCriterion("UHead >=", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadLessThan(String value) {
            addCriterion("UHead <", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadLessThanOrEqualTo(String value) {
            addCriterion("UHead <=", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadLike(String value) {
            addCriterion("UHead like", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadNotLike(String value) {
            addCriterion("UHead not like", value, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadIn(List<String> values) {
            addCriterion("UHead in", values, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadNotIn(List<String> values) {
            addCriterion("UHead not in", values, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadBetween(String value1, String value2) {
            addCriterion("UHead between", value1, value2, "uhead");
            return (Criteria) this;
        }

        public Criteria andUheadNotBetween(String value1, String value2) {
            addCriterion("UHead not between", value1, value2, "uhead");
            return (Criteria) this;
        }

        public Criteria andUregdateIsNull() {
            addCriterion("URegDate is null");
            return (Criteria) this;
        }

        public Criteria andUregdateIsNotNull() {
            addCriterion("URegDate is not null");
            return (Criteria) this;
        }

        public Criteria andUregdateEqualTo(Date value) {
            addCriterionForJDBCDate("URegDate =", value, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("URegDate <>", value, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateGreaterThan(Date value) {
            addCriterionForJDBCDate("URegDate >", value, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("URegDate >=", value, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateLessThan(Date value) {
            addCriterionForJDBCDate("URegDate <", value, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("URegDate <=", value, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateIn(List<Date> values) {
            addCriterionForJDBCDate("URegDate in", values, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("URegDate not in", values, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("URegDate between", value1, value2, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUregdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("URegDate not between", value1, value2, "uregdate");
            return (Criteria) this;
        }

        public Criteria andUlastloginIsNull() {
            addCriterion("ULastLogin is null");
            return (Criteria) this;
        }

        public Criteria andUlastloginIsNotNull() {
            addCriterion("ULastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andUlastloginEqualTo(Date value) {
            addCriterion("ULastLogin =", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginNotEqualTo(Date value) {
            addCriterion("ULastLogin <>", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginGreaterThan(Date value) {
            addCriterion("ULastLogin >", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("ULastLogin >=", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginLessThan(Date value) {
            addCriterion("ULastLogin <", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginLessThanOrEqualTo(Date value) {
            addCriterion("ULastLogin <=", value, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginIn(List<Date> values) {
            addCriterion("ULastLogin in", values, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginNotIn(List<Date> values) {
            addCriterion("ULastLogin not in", values, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginBetween(Date value1, Date value2) {
            addCriterion("ULastLogin between", value1, value2, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastloginNotBetween(Date value1, Date value2) {
            addCriterion("ULastLogin not between", value1, value2, "ulastlogin");
            return (Criteria) this;
        }

        public Criteria andUlastemitIsNull() {
            addCriterion("ULastEmit is null");
            return (Criteria) this;
        }

        public Criteria andUlastemitIsNotNull() {
            addCriterion("ULastEmit is not null");
            return (Criteria) this;
        }

        public Criteria andUlastemitEqualTo(Date value) {
            addCriterion("ULastEmit =", value, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitNotEqualTo(Date value) {
            addCriterion("ULastEmit <>", value, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitGreaterThan(Date value) {
            addCriterion("ULastEmit >", value, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitGreaterThanOrEqualTo(Date value) {
            addCriterion("ULastEmit >=", value, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitLessThan(Date value) {
            addCriterion("ULastEmit <", value, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitLessThanOrEqualTo(Date value) {
            addCriterion("ULastEmit <=", value, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitIn(List<Date> values) {
            addCriterion("ULastEmit in", values, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitNotIn(List<Date> values) {
            addCriterion("ULastEmit not in", values, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitBetween(Date value1, Date value2) {
            addCriterion("ULastEmit between", value1, value2, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUlastemitNotBetween(Date value1, Date value2) {
            addCriterion("ULastEmit not between", value1, value2, "ulastemit");
            return (Criteria) this;
        }

        public Criteria andUpermitIsNull() {
            addCriterion("UPermit is null");
            return (Criteria) this;
        }

        public Criteria andUpermitIsNotNull() {
            addCriterion("UPermit is not null");
            return (Criteria) this;
        }

        public Criteria andUpermitEqualTo(Integer value) {
            addCriterion("UPermit =", value, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitNotEqualTo(Integer value) {
            addCriterion("UPermit <>", value, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitGreaterThan(Integer value) {
            addCriterion("UPermit >", value, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPermit >=", value, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitLessThan(Integer value) {
            addCriterion("UPermit <", value, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitLessThanOrEqualTo(Integer value) {
            addCriterion("UPermit <=", value, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitIn(List<Integer> values) {
            addCriterion("UPermit in", values, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitNotIn(List<Integer> values) {
            addCriterion("UPermit not in", values, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitBetween(Integer value1, Integer value2) {
            addCriterion("UPermit between", value1, value2, "upermit");
            return (Criteria) this;
        }

        public Criteria andUpermitNotBetween(Integer value1, Integer value2) {
            addCriterion("UPermit not between", value1, value2, "upermit");
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