package com.monkey1024.test;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.text.Style;
import java.util.ArrayList;
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

    //选择年龄大于不52的
    @Test
    public void selectIf() throws Exception {
        Student student = new Student("淼", 60, 0.0);
        List<Student> students = studentDao.selectIf(student);
        students.forEach(s ->{
            System.out.println(s);
        });

    }

    //选择年龄大于不52的
    @Test
    public void selectWhere() throws Exception {
        Student student = new Student("淼", 60, 0.0);
        List<Student> students = studentDao.selectWhere(student);
        students.forEach(s ->{
           System.out.println(s);
        });

    }

    //选择年龄大于不52的
    @Test
    public void selectChoose() throws Exception {
        Student student = new Student("淼", 52, 0.0);
        List<Student> students = studentDao.selectWhere(student);
        students.forEach(s ->{
            System.out.println(s);
        });
    }

    //传入数组 筛选多个id
    @Test
    public void selectForeachArray() throws Exception {
        int[] ids = {23,24};
        List<Student> students = studentDao.selectForeachArray(ids);
        students.forEach(s ->{
            System.out.println(s);
        });
    }

    //传入集合 -list里面存放的基本数据类型
    @Test
    public void selectForeachList() throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        List<Student> students = studentDao.selectForeachList(list);
        students.forEach(s ->{
            System.out.println(s);
        });

    }

    //传入集合 -list里面存放的引用数据类型
    @Test
    public void selectForeachListStudent() throws Exception {
        List<Student> stuList = new ArrayList<>();

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setId(23);
        s2.setId(24);

        stuList.add(s1);
        stuList.add(s2);

        List<Student> students = studentDao.selectForeachListStudent(stuList);
        students.forEach(s ->{
            System.out.println(s);
        });

    }
}