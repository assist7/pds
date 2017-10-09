package com.assist7.pds.service.fund.month;

import java.util.List;

import com.assist7.pds.entity.fund.month.co.FundMonthlyAccountSearchCo;
import com.assist7.pds.entity.fund.month.vo.FundMonthlyAccountVO;
import com.assist7.pds.framework.service.IBaseService;
import com.assist7.remex.base.entity.Result;

/**
 * 月账service
 * 
 * @author Qiaoxin.Hong
 *
 */
public interface IFundMonthAccountService extends IBaseService<FundMonthlyAccountVO> {
	
	/**
	 * 查询列表
	 * @param co
	 * @return
	 */
	public Result<List<FundMonthlyAccountVO>> queryList(FundMonthlyAccountSearchCo co);
	
	/**
	 * 新增
	 * @param vo
	 * @return
	 */
	public Result<FundMonthlyAccountVO> add(FundMonthlyAccountVO vo);
	
	/**
	 * 查询最后一条账单
	 * @return
	 */
	public Result<FundMonthlyAccountVO> queryLast();
	
	/**
	 * 查询某月的月账是否已记账过了
	 * @param year
	 * @param month
	 * @return
	 */
	public Result<Integer> queryExistByMonth(Integer year, Integer month);
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public Result<Void> delete(Long id);
	
	/**
	 * 修改
	 * @param vo
	 * @return
	 */
	public Result<Void> update(FundMonthlyAccountVO vo);
}
