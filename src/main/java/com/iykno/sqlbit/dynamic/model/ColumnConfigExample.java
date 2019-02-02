package com.iykno.sqlbit.dynamic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColumnConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColumnConfigExample() {
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

        public Criteria andColumnConfigIdIsNull() {
            addCriterion("columnConfigId is null");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdIsNotNull() {
            addCriterion("columnConfigId is not null");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdEqualTo(Integer value) {
            addCriterion("columnConfigId =", value, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdNotEqualTo(Integer value) {
            addCriterion("columnConfigId <>", value, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdGreaterThan(Integer value) {
            addCriterion("columnConfigId >", value, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("columnConfigId >=", value, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdLessThan(Integer value) {
            addCriterion("columnConfigId <", value, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("columnConfigId <=", value, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdIn(List<Integer> values) {
            addCriterion("columnConfigId in", values, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdNotIn(List<Integer> values) {
            addCriterion("columnConfigId not in", values, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("columnConfigId between", value1, value2, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andColumnConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("columnConfigId not between", value1, value2, "columnConfigId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNull() {
            addCriterion("configId is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("configId is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(Integer value) {
            addCriterion("configId =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(Integer value) {
            addCriterion("configId <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(Integer value) {
            addCriterion("configId >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("configId >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(Integer value) {
            addCriterion("configId <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("configId <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<Integer> values) {
            addCriterion("configId in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<Integer> values) {
            addCriterion("configId not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("configId between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("configId not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("columnName is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("columnName is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("columnName =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("columnName <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("columnName >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("columnName >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("columnName <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("columnName <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("columnName like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("columnName not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("columnName in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("columnName not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("columnName between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("columnName not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNIsNull() {
            addCriterion("columnNameCN is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNIsNotNull() {
            addCriterion("columnNameCN is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNEqualTo(String value) {
            addCriterion("columnNameCN =", value, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNNotEqualTo(String value) {
            addCriterion("columnNameCN <>", value, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNGreaterThan(String value) {
            addCriterion("columnNameCN >", value, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNGreaterThanOrEqualTo(String value) {
            addCriterion("columnNameCN >=", value, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNLessThan(String value) {
            addCriterion("columnNameCN <", value, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNLessThanOrEqualTo(String value) {
            addCriterion("columnNameCN <=", value, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNLike(String value) {
            addCriterion("columnNameCN like", value, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNNotLike(String value) {
            addCriterion("columnNameCN not like", value, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNIn(List<String> values) {
            addCriterion("columnNameCN in", values, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNNotIn(List<String> values) {
            addCriterion("columnNameCN not in", values, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNBetween(String value1, String value2) {
            addCriterion("columnNameCN between", value1, value2, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnNameCNNotBetween(String value1, String value2) {
            addCriterion("columnNameCN not between", value1, value2, "columnNameCN");
            return (Criteria) this;
        }

        public Criteria andColumnLengthIsNull() {
            addCriterion("columnLength is null");
            return (Criteria) this;
        }

        public Criteria andColumnLengthIsNotNull() {
            addCriterion("columnLength is not null");
            return (Criteria) this;
        }

        public Criteria andColumnLengthEqualTo(Integer value) {
            addCriterion("columnLength =", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthNotEqualTo(Integer value) {
            addCriterion("columnLength <>", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthGreaterThan(Integer value) {
            addCriterion("columnLength >", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("columnLength >=", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthLessThan(Integer value) {
            addCriterion("columnLength <", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthLessThanOrEqualTo(Integer value) {
            addCriterion("columnLength <=", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthIn(List<Integer> values) {
            addCriterion("columnLength in", values, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthNotIn(List<Integer> values) {
            addCriterion("columnLength not in", values, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthBetween(Integer value1, Integer value2) {
            addCriterion("columnLength between", value1, value2, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("columnLength not between", value1, value2, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIsNull() {
            addCriterion("columnType is null");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIsNotNull() {
            addCriterion("columnType is not null");
            return (Criteria) this;
        }

        public Criteria andColumnTypeEqualTo(Integer value) {
            addCriterion("columnType =", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotEqualTo(Integer value) {
            addCriterion("columnType <>", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeGreaterThan(Integer value) {
            addCriterion("columnType >", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("columnType >=", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLessThan(Integer value) {
            addCriterion("columnType <", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLessThanOrEqualTo(Integer value) {
            addCriterion("columnType <=", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIn(List<Integer> values) {
            addCriterion("columnType in", values, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotIn(List<Integer> values) {
            addCriterion("columnType not in", values, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeBetween(Integer value1, Integer value2) {
            addCriterion("columnType between", value1, value2, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("columnType not between", value1, value2, "columnType");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("createBy =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("createBy <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("createBy >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("createBy >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("createBy <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("createBy <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("createBy like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("createBy not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("createBy in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("createBy not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("createBy between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("createBy not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("updateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("updateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("updateBy =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("updateBy <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("updateBy >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("updateBy >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("updateBy <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("updateBy <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("updateBy like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("updateBy not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("updateBy in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("updateBy not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("updateBy between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("updateBy not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(Integer value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(Integer value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(Integer value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(Integer value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(Integer value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<Integer> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<Integer> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(Integer value1, Integer value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("mark not between", value1, value2, "mark");
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