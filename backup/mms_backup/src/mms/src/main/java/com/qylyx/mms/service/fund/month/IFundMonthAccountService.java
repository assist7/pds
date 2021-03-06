package com.qylyx.mms.service.fund.month;

import java.util.List;

import com.qylyx.mms.entity.fund.month.co.FundMonthlyAccountSearchCo;
import com.qylyx.mms.entity.fund.month.vo.FundMonthlyAccountVO;
import com.qylyx.mms.framework.service.IBaseService;
import com.qylyx.remex.base.entity.Result;

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
}
