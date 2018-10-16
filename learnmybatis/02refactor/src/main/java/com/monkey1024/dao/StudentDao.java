package com.monkey1024.dao;

import com.monkey1024.bean.Student;

public interface StudentDao {
    void insertStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
}
