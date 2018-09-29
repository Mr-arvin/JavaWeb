package com.monkey1024.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.monkey.mypool.MyPool;

/**
 * 
 * 用户来使用数据库连接池
 *
 */
public class PoolTest {

	public static void main(String[] args) {
		DataSource ds = new MyPool();
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ds.getConnection();
			ps = conn.prepareStatement("....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			try {
//				这个连接用完之后不能关闭，而是用完放回到数据库连接池中
//				conn.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
		}
	}

}
