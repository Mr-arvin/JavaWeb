package com.monkey1024.test;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.dao.impl.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudentTest01 {

    private StudentDao studentDao;

    @Before
    public void initStudentDao(){
        studentDao = new StudentDaoImpl();
    }

    @Test
    public void insertStudent(){
        Student student = new Student("大淼4", 52, 98.50);

        //id的默认值是0
        System.out.println(student);
        studentDao.insertStudent(student);
        System.out.println(student);
    }

    @Test
    public  void deleteStudenidt() {
        //删除id是3的数据
        studentDao.deleteStudent(3);
    }

    @Test
    public void updateStudent() {
        Student student = new Student("毛毛周", 60, 99);
        student.setId(18);
        studentDao.updateStudent(student);
    }

    @Test
    public void selectAllStudent() {
        List<Student> students = studentDao.selectAllStudent();

        //jdk8新的foreach方法+lambda表达式
        students.forEach((s -> {
            System.out.println(s);
        }));

    }

    @Test
    public void selectStudentById() {
        Student student = studentDao.selectStudentById(20);
        System.out.println(student);
    }

    @Test
    public void selectStudentByName() {
        List<Student> students = studentDao.selectStudentByName("淼");
        students.forEach((s -> {
            System.out.println(s);
        }));

    }
}