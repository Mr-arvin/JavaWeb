package com.monkey1024.test;

import com.monkey1024.bean.Team;
import com.monkey1024.dao.TeamDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TeamTest01 {

    private TeamDao teamDao;

    private SqlSession sqlSession;

    @Before
    public void init(){
        sqlSession = MyBatisUtil.getSqlSession();
        //获取studentDao的对象
        //mapper动态代理
        teamDao = sqlSession.getMapper(TeamDao.class);
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
    public void selectTeamById() throws Exception {
        Team teamlist = teamDao.selectTeamById(2);
        System.out.println(teamlist);
        System.out.println(teamlist.getId());
        System.out.println(teamlist.getName());
        System.out.println(teamlist.getClass());
        System.out.println(teamlist.getPlayerList());

    }
}

