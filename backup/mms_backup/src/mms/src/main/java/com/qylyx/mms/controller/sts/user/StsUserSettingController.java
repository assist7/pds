package com.qylyx.mms.controller.sts.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qylyx.july.salog.annotation.Salog;
import com.qylyx.mms.entity.sts.user.vo.StsUserSettingVO;
import com.qylyx.mms.framework.controller.BaseController;
import com.qylyx.mms.service.sts.user.IStsUserSettingService;
import com.qylyx.remex.base.entity.ResultRequest;

/**
 * 用户系统设置controller
 * 
 * @author Qiaoxin.Hong
 *
 */
@Salog("用户系统设置")
@Controller
@RequestMapping("/sts/user/")
public class StsUserSettingController extends BaseController<StsUserSettingVO> {
	
	@Autowired
	private IStsUserSettingService stsUserSettingService;
	
	/**
	 * 到视图界面
	 * @return
	 */
	@RequestMapping("toView")
	public String toView() {
		return "sts/user/view";
	}
	
	/**
	 * 保存
	 * @param vo
	 * @return
	 */
	@Salog("保存")
	@RequestMapping("update")
	@ResponseBody
	public ResultRequest update(@RequestParam Map<String, Object> params) {
		return stsUserSettingService.update(params).getWebResult();
	}
}
