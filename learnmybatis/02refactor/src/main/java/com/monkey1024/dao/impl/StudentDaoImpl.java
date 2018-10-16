package com.monkey1024.dao.impl;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class StudentDaoImpl implements StudentDao {

    @Override
    public void insertStudent(Student student){
        //因为sqlSession实现了AutoCloseble接口，所以可以自动关闭
        try(SqlSession sqlSession = MyBatisUtil.getSqlSession()){
            //新增操作
            sqlSession.insert("insertStudent", student);
            //铸键的生成和事务是否提交关系，只要执行了sql语句，那就会分配一个主键
            System.out.println("提交事务之前：" + student);
            //提交事务
            sqlSession.commit();
            //回滚事务 sqlSession.rollback();
        }
    }

    @Override
    public void deleteStudent(int id) {
        try(SqlSession sqlSession = MyBatisUtil.getSqlSession();){

            sqlSession.delete("deleteStudent", id);

            sqlSession.commit();
        }
    }

    @Override
    public void updateStudent(Student student) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        sqlSession.update("updateStudent", student);
        sqlSession.commit();

    }

    @Override
    public List<Student> selectAllStudent() {
        List<Student> result = null;

        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            //查询
            result = sqlSession.selectList("selectAllStudent");

        }

        return result;

    }
}
