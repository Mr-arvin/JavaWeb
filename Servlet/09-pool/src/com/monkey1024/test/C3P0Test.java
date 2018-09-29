package com.monkey1024.test;

import java.sql.SQLException;
import com.monkey1024.util.C3P0Util;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 测试c3p0
 * 
 * @author xm
 *
 */
public class C3P0Test {

	public static void main(String[] args) {
		insert();
		try {
			// 睡眠一下方便查看状态
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		C3P0Util.poolStatus();
	}

	public static void insert() {

		String sql = "insert into t_user(id,name) values('1022','jack')";
		try (Connection conn = C3P0Util.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			// 查看连接池的状态
			C3P0Util.poolStatus();
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
