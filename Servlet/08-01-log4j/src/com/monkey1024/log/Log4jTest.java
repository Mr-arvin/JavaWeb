package com.monkey1024.log;

import org.apache.log4j.Logger;

/**
 * 
 * 普通的记录日志
 *
 */
public class Log4jTest {
	public static void main(String[] args) {
		//创建记录之日的对象
		Logger log = Logger.getLogger(Log4jTest.class);
		
		//下面语句会根据log4j.properties中的日志级别输出
	    log.debug("debug信息");
	    log.info("info信息");
	    log.warn("warn信息");
	    log.error("error信息");
	}
}
