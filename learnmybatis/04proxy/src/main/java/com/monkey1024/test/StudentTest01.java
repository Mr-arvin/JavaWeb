package com.monkey1024.test;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void insertStudent(){
        Student student = new Student("大淼3344", 52, 98.50);

        //id的默认值是0
        System.out.println(student);
        studentDao.insertStudent(student);
        sqlSession.commit();
        System.out.println(student);
    }

    @Test
    public  void deleteStudenidt() {
        //删除id是3的数据
        studentDao.deleteStudent(18);
        sqlSession.commit();
    }

    @Test
    public void updateStudent() {
        Student student = new Student("毛毛周", 24, 99);
        student.setId(23);
        studentDao.updateStudent(student);
        sqlSession.commit();
    }

    @Test
    public void selectAllStudent() {
        List<Student> students = studentDao.selectAllStudent();

        //jdk8新的foreach方法+lambda表达式
        students.forEach(s -> {
            System.out.println(s);
        });

    }

    @Test
    public void selectStudentById() {
        Student student = studentDao.selectStudentById(20);
        System.out.println(student);
    }

    @Test
    public void selectStudentByName() {
        List<Student> students = studentDao.selectStudentByName("淼");
        students.forEach(s -> {
            System.out.println(s);
        });

    }

    @Test
    public void selectStudentPwd() {
        Student student = studentDao.selectStudentPwd(20);
        System.out.println(student);
    }
}