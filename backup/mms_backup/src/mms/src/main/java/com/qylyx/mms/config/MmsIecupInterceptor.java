package com.qylyx.mms.config;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.qylyx.remex.iecup.interceptor.IecupInterceptor;

/**
 * 接口异常集中统一处理的拦截器
 * 
 * @author Qiaoxin.Hong
 *
 */

@Component
//@Order(999)目的保证此aop的执行顺序在事务aop之后，保证先回滚事务
@Order(999)  
public class MmsIecupInterceptor extends IecupInterceptor {

}
