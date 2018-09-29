package com.monkey1024.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0
 * @author xm
 *
 */
public class C3P0Util {
	//获取C3P0数据源
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	//从数据源中获取一个连接对象
	//获取一个Connection对象，该Connection是经过c3p0装饰后的Connection
	public static Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("服务器错误");
		}
	}
	
	//查看连接池的状态
	public static void poolStatus() {
		try {
			System.out.println("清闲的"+dataSource.getNumIdleConnections());
			System.out.println("忙碌的"+dataSource.getNumBusyConnections());
			System.out.println("所有的"+dataSource.getNumConnections());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
