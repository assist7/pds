package com.qylyx.mms.dao.sts.user;

import org.apache.ibatis.annotations.Param;


/**
 * 用户系统设置dao
 * 
 * @author Qiaoxin.Hong
 *
 */
public interface IStsUserSettingDao {
	
	/**
	 * 修改某一设置项
	 * @param params
	 * @return
	 */
	public int update(@Param("code") String code, @Param("val") String val);
}
