package jdbc02;

import jdbc02.bean.User;
import jdbc02.util.DBUtil;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用jdbc实现增删改
 */

public class CRUD_Test03 {
    @Test
    public void testInsert() {
        String sql = "INSERT INTO t_user(name,password,email,birthday) VALUES (?,?,?,?)";
       try (
               Connection conn = DBUtil.getConnection ();
               PreparedStatement stmt = conn.prepareStatement (sql);
       ) {
           stmt.setString (1,"dog");
           stmt.setString (2,"asdasd");
           stmt.setString (3,"dog@qq.com");
           stmt.setString (4,"1992-11-12");
           int flag = stmt.executeUpdate ();
           if(flag > 0){
               System.out.println ("插入成功");
           }else {
               System.out.println ("插入失败");
           }

       } catch (SQLException e) {
           e.printStackTrace ();
       }
    }

//    int flag = stmt.executeUpdate ("INSERT INTO t_user(name,password,email,birthday) VALUES\n" +
//            "('cat','24323423','cat@163.com','1999-11-11')");

    @Test
    public void testUpdata() throws ClassNotFoundException, SQLException {
        Class.forName ("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/JDBC_Study", "root", "asdasdasd");

        Statement stmt = conn.createStatement ();

        int flag = stmt.executeUpdate ("update `JDBC_Study`.`t_user` set `password`='qweqweqwe', `id`='4', `email`='cat@163.com', `name`='cat', `birthday`='1999-11-11' where `id`='4';");

        if (flag > 0) {
            System.out.println ("成功");
        }

        stmt.close ();
        conn.close ();
    }

    @Test
    public void testDelete() {
        String sql = "DELETE FROM t_user WHERE name=?";

        try(
                Connection conn = DBUtil.getConnection ();
                PreparedStatement stmt = conn.prepareStatement (sql);
            ){

            stmt.setString (1,"cat");

            int flag = stmt.executeUpdate ();
            if(flag > 1){
                System.out.println ("删除成功！");
            }else {
                System.out.println ("删除失败！");
            }

        } catch (SQLException e) {
            e.printStackTrace ();
        }

    }

    //正确的写法
    @Test
    public void testSelect() {

        //获取连接Connection
        ResultSet rs1 = null;
        try (
                Connection conn = jdbc02.util.DBUtil.getConnection ();
                //得到执行sequel语句的对象Statement
                Statement stmt = conn.createStatement ();
                //执行sql语句，并返回结果
                ResultSet rs = stmt.executeQuery ("select id,name,password,email,birthday from t_user")
        ) {

            //处理结果
            List<User> userList = new ArrayList<> ();
            while (rs.next ()) {
                User u = new User ();
                u.setId (rs.getInt ("id"));
                u.setName (rs.getString ("name"));
                u.setPassword (rs.getString ("password"));
                u.setEmail (rs.getString ("email"));
                u.setBirthday (rs.getDate ("birthday"));
                userList.add (u);
            }

            System.out.println (userList);

            rs1 = rs;

            rs.close ();

            stmt.close ();

            conn.close ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }


    }

}
