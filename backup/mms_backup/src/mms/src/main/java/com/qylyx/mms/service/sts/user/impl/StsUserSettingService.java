package com.qylyx.mms.service.sts.user.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qylyx.july.salog.annotation.Salog;
import com.qylyx.july.utils.tolerant.TolerantUtils;
import com.qylyx.mms.dao.sts.user.IStsUserSettingDao;
import com.qylyx.mms.entity.sts.user.vo.StsUserSettingVO;
import com.qylyx.mms.framework.service.BaseService;
import com.qylyx.mms.service.sts.user.IStsUserSettingService;
import com.qylyx.remex.base.entity.Result;

/**
 * 用户系统设置service
 * 
 * @author Qiaoxin.Hong
 *
 */
@Salog("用户系统设置service")
@Service
public class StsUserSettingService extends BaseService<StsUserSettingVO> implements IStsUserSettingService {
	
	@Autowired
	private IStsUserSettingDao stsUserSettingDao; 
	
	/**
	 * 修改设置项
	 * @param params
	 * @return
	 */
	@Salog("修改设置项")
	@Transactional
	@Override
	public Result<Void> update(Map<String, Object> params) {
		if (params != null) {
			for (String code : params.keySet()) {
				stsUserSettingDao.update(code, TolerantUtils.defaultStr(params.get(code)));
			}
		}
		return new Result<Void>();
	}
}
