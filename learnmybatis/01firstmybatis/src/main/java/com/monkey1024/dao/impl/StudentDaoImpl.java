package com.monkey1024.dao.impl;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class StudentDaoImpl implements StudentDao {

    private SqlSession sqlSession;

    @Override
    public void insertStudent(Student student){
        try {
            //读取主配置文件
            InputStream input = Resources.getResourceAsStream("mybatis.xml");
            //创建SqlSessionFactory对象
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
            //创建SqlSession对象
            sqlSession = sessionFactory.openSession();
            //新增数据操作
            sqlSession.insert("insertStudent", student);
            //提交SqlSession 提交一下事物
            sqlSession.commit();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
    }
}
