package com.assist7.pds.service.sys;

import com.assist7.pds.framework.service.IBaseService;

/**
 * 系统初始化的service
 * 
 * @author Qiaoxin.Hong
 *
 */
public interface ISysInitService extends IBaseService<Object> {

	/**
	 * 初始化数据库脚本
	 */
	public void initDbSql();
}
