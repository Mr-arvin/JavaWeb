package com.monkey1024.dao;

import com.monkey1024.bean.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectIf(Student student);
    List<Student> selectWhere(Student student);
    List<Student> selectChoose(Student student);
    List<Student> selectForeachArray(int[] ids);
    List<Student> selectForeachList(List<Integer> list);
    List<Student> selectForeachListStudent(List<Student> list);
}
