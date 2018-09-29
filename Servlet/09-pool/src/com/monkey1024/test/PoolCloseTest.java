package com.monkey1024.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.monkey.mypool.MyPool;

public class PoolCloseTest {

	public static void main(String[] args) {
		MyCLosePool ds = new MyCLosePool();
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ds.getConnectionFromPool();
			ps = conn.prepareStatement("....");
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

}
