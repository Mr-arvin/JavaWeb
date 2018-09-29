package service;

import jdbc.bean.User;
import jdbc02.util.DBUtil;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginService {
    @Test
    public User findUserByNameAndPassword(String name, String password) { //返回一个User类型
        ResultSet rs1 = null;
        User u = null;
        String sql = "select id,name,password,email,birthday from t_user where name='" + name + "' and password= '" + password + "'";
        System.out.println (sql);
        try (
                Connection conn = DBUtil.getConnection ();
                Statement stmt = conn.createStatement ();
                ResultSet rs = stmt.executeQuery (sql);
        ) {
            List<User> userList = new ArrayList<> ();
            while (rs.next ()){
                u = new User ();
                u.setId (rs.getInt ("id"));
                u.setName (rs.getString ("name"));
                u.setPassword (rs.getString ("password"));
                u.setBirthday (rs.getDate ("birthday"));
                u.setEmail (rs.getString ("email"));
            }
//            rs1 = rs; //写在try()里面的会自动关闭
//            rs1.close ();
//            stmt.close ();
//            conn.close ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }

        return u; //把u返回给函数调用者

    }
}
