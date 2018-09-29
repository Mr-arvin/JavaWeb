package com.monkey.mypool;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.monkey1024.util.DBUtil;

public class MyColsePool implements DataSource {

	//创建一个存放连接的池子，需要保证线程安全
	//因为会频繁的对数据库连接吃进行取出和放回的操作，所以使用LinkedList作为池子,创建一个线程安全的List用synchronizedCollection
	private static LinkedList<Connection> pool = (LinkedList<Connection>)Collections.synchronizedCollection(new LinkedList<Connection>());
	//在类加载后就像数据库连接池中添加10个数据库连接对象
	static {
		try {
			for(int i=0; i<10; i++) {
				Connection connection = DBUtil.getConnection();
				//将创建好的链接数据库放到池子里面
				pool.add(connection);
			}			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		
		//判断数据库连接池中是否还有数据库连接对象
		if(pool.size() > 0) {
			conn = pool.removeFirst();
		}else {
			//此时数据库连接池中没有可用的数据库连接了
			throw new RuntimeException("服务器忙，请稍后再试");
		}
		
		return conn;		
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
