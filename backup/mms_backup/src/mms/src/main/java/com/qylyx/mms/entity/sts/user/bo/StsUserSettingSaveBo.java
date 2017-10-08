package com.qylyx.mms.entity.sts.user.bo;

/**
 * 用户系统设置保存实体条件参数
 * 
 * @author Qiaoxin.Hong
 *
 */
public class StsUserSettingSaveBo {
	
	/**
	 * 登录路过，0：否；1：是
	 */
	private String loginSkip;
	
	
	
	
	
	public void setLoginSkip(String loginSkip) {
		this.loginSkip = loginSkip;
	}
	
	public String getLoginSkip() {
		return loginSkip;
	}
}
