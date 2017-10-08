package com.qylyx.mms.framework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qylyx.remex.framework.base.service.RemexBaseService;

/**
 * mms基础service
 * 
 * @author Qiaoxin.Hong
 *
 * @param <E>
 */
public class BaseService<E> extends RemexBaseService<E> implements IBaseService<E> {
	/**
	 * 日志记录器
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	
}
