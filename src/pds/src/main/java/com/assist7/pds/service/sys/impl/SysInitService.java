package com.assist7.pds.service.sys.impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assist7.july.salog.annotation.Salog;
import com.assist7.pds.dao.sys.ISysInitDao;
import com.assist7.pds.exception.PdsException;
import com.assist7.pds.framework.service.BaseService;
import com.assist7.pds.service.sys.ISysInitService;

/**
 * 系统初始化的service
 * 
 * @author Qiaoxin.Hong
 *
 */
@Salog("系统初始化的service")
@Service
public class SysInitService extends BaseService<Object> implements ISysInitService {
	
	@Autowired
	private ISysInitDao sysInitDao;
	
	@Autowired
	private DataSource dataSource;
	
	/**
	 * 初始化数据库脚本，只会生成一次
	 */
	@Salog("初始化数据库脚本")
	@PostConstruct
	@Override
	public void initDbSql() {
		try {
			//查询是否初始化过数据库
			int isInit = sysInitDao.queryIsInitDatabase();
			
			//未曾初始化过，则进行数据库的初始化
			if (isInit == 0) {
				logger.info("****************************** 进行系统数据库的初始化 ***********************************");
				
				ScriptRunner runner = new ScriptRunner(dataSource.getConnection());
				// 自动提交事务
				runner.setAutoCommit(true);
				// 遇到错误是否停止执行
				runner.setStopOnError(true);
				runner.runScript(Resources.getResourceAsReader("sql/mms-init.sql"));
				
				//初始化完毕后，打上一个已初始化过的标识
				sysInitDao.saveInitDatabaseOverFlag();
			}
		} catch (Exception e) {
			logger.error("初始化数据库脚本异常！", e);
			throw new PdsException("初始化数据库脚本异常！", e);
		}
	}
	
	
}
