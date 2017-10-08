package com.qylyx.mms.dao.fund.month;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qylyx.mms.entity.fund.month.co.FundMonthlyAccountSearchCo;
import com.qylyx.mms.entity.fund.month.vo.FundMonthlyAccountVO;

/**
 * 月账dao
 * 
 * @author Qiaoxin.Hong
 *
 */
public interface IFundMonthAccountDao {
	
	/**
	 * 查询列表
	 * @param co
	 * @return
	 */
	public List<FundMonthlyAccountVO> queryList(FundMonthlyAccountSearchCo co);
	
	/**
	 * 新增
	 * @param vo
	 * @return
	 */
	public int save(FundMonthlyAccountVO vo);
	
	/**
	 * 查询最后一条账单
	 * @return
	 */
	public FundMonthlyAccountVO queryLast();
	
	/**
	 * 查询某月的月账是否已记账过了
	 * @param year
	 * @param month
	 * @return
	 */
	public int queryExistByMonth(@Param("year") Integer year, @Param("month") Integer month);
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public int delete(@Param("id") Long id);
}
