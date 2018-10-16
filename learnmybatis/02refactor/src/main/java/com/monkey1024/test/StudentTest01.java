package com.monkey1024.test;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.dao.impl.StudentDaoImpl;
import org.junit.Test;

public class StudentTest01 {

    @Test
    public void insertStudent(){
        StudentDao studentDao = new StudentDaoImpl();
        Student student = new Student("大淼", 52, 98.50);

        studentDao.insertStudent(student);
    }
}