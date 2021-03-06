package com.qylyx.mms.service.fund.month.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qylyx.july.salog.annotation.Salog;
import com.qylyx.mms.dao.fund.month.IFundMonthAccountDao;
import com.qylyx.mms.entity.fund.month.co.FundMonthlyAccountSearchCo;
import com.qylyx.mms.entity.fund.month.vo.FundMonthlyAccountVO;
import com.qylyx.mms.framework.service.BaseService;
import com.qylyx.mms.service.fund.month.IFundMonthAccountService;
import com.qylyx.remex.base.entity.Result;

/**
 * 月账service
 * 
 * @author Qiaoxin.Hong
 *
 */
@Salog("月账service")
@Service
public class FundMonthAccountService extends BaseService<FundMonthlyAccountVO> implements IFundMonthAccountService {
	
	@Autowired
	private IFundMonthAccountDao fundMonthAccountDao; 

	/**
	 * 查询列表
	 */
	@Salog("查询列表")
	@Override
	public Result<List<FundMonthlyAccountVO>> queryList(FundMonthlyAccountSearchCo co) {
		List<FundMonthlyAccountVO> list = fundMonthAccountDao.queryList(co);
		return new Result<List<FundMonthlyAccountVO>>(list);
	}

	/**
	 * 新增
	 * @param vo
	 * @return
	 */
	@Salog("新增")
	@Override
	public Result<FundMonthlyAccountVO> add(FundMonthlyAccountVO vo) {
		vo.setCreateTime(new Date());
		vo.setSurplus(vo.getNextSurplus() + vo.getEarning() - vo.getExpense());
		
		fundMonthAccountDao.save(vo);
		return new Result<FundMonthlyAccountVO>(vo);
	}
	
	/**
	 * 查询最后一条账单
	 * @return
	 */
	@Override
	public Result<FundMonthlyAccountVO> queryLast() {
		FundMonthlyAccountVO vo = fundMonthAccountDao.queryLast();
		return new Result<FundMonthlyAccountVO>(vo); 
	}
	
	/**
	 * 查询某月的月账是否已记账过了
	 */
	@Override
	public Result<Integer> queryExistByMonth(Integer year, Integer month) {
		int count = fundMonthAccountDao.queryExistByMonth(year, month);
		return new Result<Integer>(count);
	}
	
	/**
	 * 删除
	 */
	@Override
	public Result<Void> delete(Long id) {
		fundMonthAccountDao.delete(id);
		return new Result<>();
	}
}
