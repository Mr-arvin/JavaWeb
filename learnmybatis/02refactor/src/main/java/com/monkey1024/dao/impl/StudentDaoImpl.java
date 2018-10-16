package com.monkey1024.dao.impl;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;


public class StudentDaoImpl implements StudentDao {

    @Override
    public void insertStudent(Student student){
        //因为sqlSession实现了AutoCloseble接口，所以可以自动关闭
        try(SqlSession sqlSession = MyBatisUtil.getSqlSession()){
            //新增操作
            sqlSession.insert("insertStudent", student);
            //提交事务
            sqlSession.commit();
        }
    }
}
