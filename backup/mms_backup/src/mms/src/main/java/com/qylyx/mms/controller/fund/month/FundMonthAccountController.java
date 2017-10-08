package com.qylyx.mms.controller.fund.month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qylyx.july.salog.annotation.Salog;
import com.qylyx.mms.entity.fund.month.co.FundMonthlyAccountSearchCo;
import com.qylyx.mms.entity.fund.month.vo.FundMonthlyAccountVO;
import com.qylyx.mms.framework.controller.BaseController;
import com.qylyx.mms.service.fund.month.IFundMonthAccountService;
import com.qylyx.remex.base.entity.ResultRequest;

/**
 * 月账controller
 * 
 * @author Qiaoxin.Hong
 *
 */
@Salog("月账controller")
@Controller
@RequestMapping("/fund/month/account/")
public class FundMonthAccountController extends BaseController<FundMonthlyAccountVO> {
	
	@Autowired
	private IFundMonthAccountService fundMonthAccountService; 
	
	/**
	 * 到视图界面
	 * @return
	 */
	@Salog("到视图界面")
	@RequestMapping("toView")
	public String toView() {
		return "fund/month/account";
	}
	
	/**
	 * 查询列表
	 * @param co
	 * @return
	 */
	@Salog("查询列表")
	@RequestMapping("queryList")
	@ResponseBody
	public ResultRequest queryList(FundMonthlyAccountSearchCo co) {
		return fundMonthAccountService.queryList(co).getWebResult();
	}
	
	/**
	 * 新增
	 * @param vo
	 * @return
	 */
	@Salog("新增")
	@RequestMapping("add")
	@ResponseBody
	public ResultRequest add(FundMonthlyAccountVO vo) {
		return fundMonthAccountService.add(vo).getWebResult();
	}
	
	/**
	 * 查询最后一条账单
	 * @return
	 */
	@Salog("查询最后一条账单")
	@RequestMapping("queryLast")
	@ResponseBody
	public ResultRequest queryLast() {
		return fundMonthAccountService.queryLast().getWebResult();
	}
	
	/**
	 * 查询某月的月账是否已记账过了
	 * @return
	 */
	@Salog("查询某月的月账是否已记账过了")
	@RequestMapping("queryExistByMonth")
	@ResponseBody
	public ResultRequest queryExistByMonth(Integer year, Integer month) {
		return fundMonthAccountService.queryExistByMonth(year, month).getWebResult();
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@Salog("删除")
	@RequestMapping("delete")
	@ResponseBody
	public ResultRequest delete(Long id) {
		return fundMonthAccountService.delete(id).getWebResult();
	}
}
