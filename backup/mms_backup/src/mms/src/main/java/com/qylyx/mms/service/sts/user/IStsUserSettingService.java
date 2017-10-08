package com.qylyx.mms.service.sts.user;

import java.util.Map;

import com.qylyx.mms.entity.sts.user.vo.StsUserSettingVO;
import com.qylyx.mms.framework.service.IBaseService;
import com.qylyx.remex.base.entity.Result;

/**
 * 用户系统设置service
 * 
 * @author Qiaoxin.Hong
 *
 */
public interface IStsUserSettingService extends IBaseService<StsUserSettingVO> {
	
	/**
	 * 修改设置项
	 * @param params
	 * @return
	 */
	public Result<Void> update(Map<String, Object> params);
	
}
