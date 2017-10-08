package com.qylyx.mms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qylyx.july.salog.annotation.Salog;
import com.qylyx.mms.entity.sys.User;

/**
 * 主controller
 * 
 * @author Qiaoxin.Hong
 *
 */
@Salog("主controller")
@Controller
@RequestMapping("/")
public class MainController {

	/**
	 * 主页
	 * @return
	 */
	@Salog("主页")
	@RequestMapping("main")
	public String main(Model model) {
		User user = new User();
		user.setUsername("admin");
		model.addAttribute("loginUser", user);
		return "main";
	}
	
	/**
	 * 首页
	 * @return
	 */
	@Salog("首页")
	@RequestMapping("index")
	public String index() {
		return "sys/index";
	}
}
