package com.monkey1024.pool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;

import com.monkey1024.util.DBUtil;

/**
 * 模拟编写一个数据库连接池
初始化一个数据库连接池并向里面添加10个数据库连接
从连接池中获取连接
当程序用完连接后，需要将该连接重新放入到连接池中
 */
public class SimpleConnectionPool {
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
	
	//从连接池中获取一个数据库连接
	public static Connection getConnectionFromPool() {
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
	
	//当程序用完连接后，需要将该连接重新放入连接池中
	public static void release(Connection conn) {
		pool.addLast(conn);
	}
}
