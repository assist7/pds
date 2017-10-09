package com.assist7.pds.entity.fund.month.co;

import java.io.Serializable;

/**
 * 月账查询列表条件参数
 * 
 * @author Qiaoxin.Hong
 *
 */
public class FundMonthlyAccountSearchCo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** 年份 */
    private Integer year;

    /** 月份 */
    private Integer month;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}
    
    
}
