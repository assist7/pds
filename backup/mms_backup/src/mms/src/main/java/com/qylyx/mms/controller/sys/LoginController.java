package com.qylyx.mms.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qylyx.july.salog.annotation.Salog;
import com.qylyx.mms.entity.sys.User;

/**
 * 登录及相关的controller
 * 
 * @author Qiaoxin.Hong
 *
 */
@Salog("登录及相关处理controller")
@Controller
@RequestMapping("/")
public class LoginController {

	/**
	 * 登录
	 * @return
	 */
	@Salog("登录")
	@RequestMapping("login")
	@ResponseBody
	public User login() {
		User user = new User();
		user.setUsername("admin");
		return user;
	}
}
