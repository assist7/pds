/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.0.0
 */

package com.qylyx.mms.entity.sts.user.vo;

/**
 * 用户系统设置表(STS_USER_SETTING)
 * 
 * @author bianj
 * @version 1.0.0 2017-08-26
 */
public class StsUserSettingVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4150064639596739926L;

    /** 设置项code */
    private String code;

    /** 设置项value */
    private String val;

    /** 备注 */
    private String remark;

    /**
     * 获取设置项code
     * 
     * @return 设置项code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * 设置设置项code
     * 
     * @param suscode
     *          设置项code
     */
    public String getCode() {
		return code;
	}

    /**
     * 获取设置项value
     * 
     * @return 设置项value
     */
    public void setVal(String val) {
		this.val = val;
	}

    /**
     * 设置设置项value
     * 
     * @param susValue
     *          设置项value
     */
    public String getVal() {
		return val;
	}

    /**
     * 获取备注
     * 
     * @return 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置备注
     * 
     * @param remark
     *          备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}