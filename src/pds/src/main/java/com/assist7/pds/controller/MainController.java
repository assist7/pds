package com.assist7.pds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assist7.july.salog.annotation.Salog;

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
	public String main() {
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
