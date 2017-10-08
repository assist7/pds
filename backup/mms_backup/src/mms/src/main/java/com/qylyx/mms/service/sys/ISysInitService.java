package com.qylyx.mms.service.sys;

import com.qylyx.mms.framework.service.IBaseService;

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
