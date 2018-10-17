package com.monkey1024.test;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.text.Style;
import java.util.List;

public class StudentTest01 {

    private StudentDao studentDao;

    private SqlSession sqlSession;

    @Before
    public void init(){
        sqlSession = MyBatisUtil.getSqlSession();
        //获取studentDao的对象
        //mapper动态代理
        studentDao = sqlSession.getMapper(StudentDao.class);
    }

    /**
     * 方法执行完成后，需要关闭sqlSession
     */
    @After
    public void closeSession() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    public void selectIf() throws Exception {
        Student student = new Student("淼", 60, 0.0);
        List<Student> students = studentDao.selectIf(student);
        students.forEach(s ->{
            System.out.println(s);
        });

    }

    @Test
    public void selectWhere() throws Exception {
        Student student = new Student("淼", 60, 0.0);
        List<Student> students = studentDao.selectWhere(student);
        students.forEach(s ->{
           System.out.println(s);
        });

    }

    @Test
    public void selectChoose() throws Exception {
        Student student = new Student("淼", 0, 0.0);
        List<Student> students = studentDao.selectWhere(student);
        students.forEach(s ->{
            System.out.println(s);
        });
    }
}