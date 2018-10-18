package com.monkey1024.test;

import com.monkey1024.bean.Player;
import com.monkey1024.dao.PlayerDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class PlayerTest01 {

    private PlayerDao playerDao;

    private SqlSession sqlSession;

    @Before
    public void init(){
        sqlSession = MyBatisUtil.getSqlSession();
        //获取playerDao的对象
        //mapper动态代理
        playerDao = sqlSession.getMapper(PlayerDao.class);
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

    //一对一的查询
    @Test
    public void selectTeamById() throws Exception {
        Player player = playerDao.selectPlayerById(2);
        System.out.println(player.getTeam());
        System.out.println(player.getName());
        System.out.println(player.getSex());
        System.out.println(player);

    }

    //多对一
    @Test
    public void selectPlayer() {
        List<Player> players = playerDao.selectPlayer();
        players.forEach(p ->{
            System.out.println(p);
        });

    }
}

