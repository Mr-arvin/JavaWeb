package com.monkey1024.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * DCL的单例模式
 * 它可以运行在多线程的程序中不会出问题
 */
public class MyBatisUtil {

    //无需将构造方法私有化，因为这里面只要保证创建一个SqlSessionFactory的对象
    //private MyBatisUtil() {}

    private static volatile SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {
        try {
            if(sqlSessionFactory == null){
                //读取主配置文件
                InputStream input = Resources.getResourceAsStream("mybatis.xml");
                //同步代码块
                synchronized (MyBatisUtil.class){
                    if(sqlSessionFactory == null) {
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSessionFactory.openSession(false); //false和不填一样为手动提交事务，如果改成true，那么就不需要在调用的时候commit了，也就是自动提交事务；
    }
}
