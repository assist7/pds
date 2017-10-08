package com.assist7.pds.dao.sys;

/**
 * 系统初始化的dao
 * 
 * @author Qiaoxin.Hong
 *
 */
public interface ISysInitDao {
	
	/**
	 * 查询是否初始化过数据库，0：否，1：是
	 */
	public int queryIsInitDatabase();
	
	/**
	 * 在初始化数据库后，打上一个已初始化过的标识
	 * @return
	 */
	public int saveInitDatabaseOverFlag();
}
