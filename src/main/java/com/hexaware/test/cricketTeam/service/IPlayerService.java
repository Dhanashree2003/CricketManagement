package com.hexaware.test.cricketTeam.service;

import java.util.List;

import com.hexaware.test.cricketTeam.entity.Player;

public interface IPlayerService {
    Player addPlayer(Player player);
    Player updatePlayer(Integer playerId,Player player);
    Player getPlayerById(Integer id);
    List<Player> getAllPlayers();
    String deletePlayerById(Integer id);
    List<Object[]> getTotalMatchesByRole(String role);

}
