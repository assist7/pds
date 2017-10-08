/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.0.0
 */

package com.assist7.pds.entity.fund.month.vo;

import java.util.Date;

/**
 * 月账表(FUND_MONTHLY_ACCOUNT)
 * 
 * @author bianj
 * @version 1.0.0 2017-08-31
 */
public class FundMonthlyAccountVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8459832758565456157L;

    /** 主键ID */
    private Long id;

    /** 年份 */
    private Integer year;

    /** 月份 */
    private Integer month;

    /** 上月结余 */
    private Double nextSurplus;

    /** 本月收入 */
    private Double earning;

    /** 本月支出 */
    private Double expense;

    /** 本月结余 */
    private Double surplus;

    /** 非常规收入 */
    private Double unnormalEarning;

    /** 非常规支出 */
    private Double unnormalExpense;

    /** 创建时间 */
    private Date createTime;

    /**
     * 获取主键ID
     * 
     * @return 主键ID
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置主键ID
     * 
     * @param id
     *          主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取年份
     * 
     * @return 年份
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * 设置年份
     * 
     * @param year
     *          年份
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 获取月份
     * 
     * @return 月份
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * 设置月份
     * 
     * @param month
     *          月份
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * 获取上月结余
     * 
     * @return 上月结余
     */
    public Double getNextSurplus() {
        return this.nextSurplus;
    }

    /**
     * 设置上月结余
     * 
     * @param nextSurplus
     *          上月结余
     */
    public void setNextSurplus(Double nextSurplus) {
        this.nextSurplus = nextSurplus;
    }

    /**
     * 获取本月收入
     * 
     * @return 本月收入
     */
    public Double getEarning() {
        return this.earning;
    }

    /**
     * 设置本月收入
     * 
     * @param earning
     *          本月收入
     */
    public void setEarning(Double earning) {
        this.earning = earning;
    }

    /**
     * 获取本月支出
     * 
     * @return 本月支出
     */
    public Double getExpense() {
        return this.expense;
    }

    /**
     * 设置本月支出
     * 
     * @param expense
     *          本月支出
     */
    public void setExpense(Double expense) {
        this.expense = expense;
    }

    /**
     * 获取本月结余
     * 
     * @return 本月结余
     */
    public Double getSurplus() {
		return surplus;
	}
    
    /**
     * 设置本月结余
     * 
     * @param column7
     *          本月结余
     */
    public void setSurplus(Double surplus) {
		this.surplus = surplus;
	}

    /**
     * 获取非常规收入
     * 
     * @return 非常规收入
     */
    public Double getUnnormalEarning() {
        return this.unnormalEarning;
    }

    /**
     * 设置非常规收入
     * 
     * @param unnormalEarning
     *          非常规收入
     */
    public void setUnnormalEarning(Double unnormalEarning) {
        this.unnormalEarning = unnormalEarning;
    }

    /**
     * 获取非常规支出
     * 
     * @return 非常规支出
     */
    public Double getUnnormalExpense() {
        return this.unnormalExpense;
    }

    /**
     * 设置非常规支出
     * 
     * @param unnormalExpense
     *          非常规支出
     */
    public void setUnnormalExpense(Double unnormalExpense) {
        this.unnormalExpense = unnormalExpense;
    }

    /**
     * 获取创建时间
     * 
     * @return 创建时间
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置创建时间
     * 
     * @param createTime
     *          创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}