package com.monkey1024.dao;

import com.monkey1024.bean.Student;

import java.util.List;

public interface StudentDao {
    void insertStudent(Student student) throws Exception;
    void deleteStudent(int id) throws Exception;
    void updateStudent(Student student) throws Exception;
    List<Student> selectAllStudent() throws Exception;
    Student selectStudentById(int id) throws Exception;
    List<Student> selectStudentByName(String name) throws Exception;
}
