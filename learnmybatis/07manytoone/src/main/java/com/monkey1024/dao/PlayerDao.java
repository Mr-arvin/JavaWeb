package com.monkey1024.dao;

import com.monkey1024.bean.Player;

import java.util.List;

public interface PlayerDao {
    Player selectPlayerById(int id);
    List<Player> selectPlayer();
}
