package com.sf.log.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {

	private static Logger logger = LoggerFactory.getLogger(TestLog.class);
	
	/**
	 * 使用slf4j作为接口框架
	 * 底层实现要么使用log4j，要么使用logback，两个xml文件留一个即可，pom中留一份即可
	 *	@ReturnType	void 
	 *	@Date	2018年7月11日	上午10:36:26
	 *  @Param  @param args
	 */
	public static void main(String[] args) {
		logger.debug("##############哈哈哈哈################");
		logger.info("##############哈哈哈哈################");
		logger.warn("##############哈哈哈哈################");
		logger.error("##############哈哈哈哈################");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
