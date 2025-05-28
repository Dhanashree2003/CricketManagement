package com.hexaware.test.cricketTeam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.test.cricketTeam.entity.Player;
import com.hexaware.test.cricketTeam.exception.PlayerNotFoundException;
import com.hexaware.test.cricketTeam.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements IPlayerService {

    @Autowired
    private PlayerRepository repo;

    @Override
    public Player addPlayer(Player player) {
        return repo.save(player);
    }

    @Override
    public Player updatePlayer(Integer id,Player player) {
    	

    	    Player existing = repo.findById(player.getPlayerId())
    	        .orElseThrow(() -> new PlayerNotFoundException());

    	    existing.setPlayerId(player.getPlayerId());
    	    existing.setJerseynumber(player.getJerseynumber());
    	    existing.setRole(player.getRole());

    	    return repo.save(existing); 
    	}

        
  

    @Override
    public Player getPlayerById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Player> getAllPlayers() {
        return repo.findAll();
    }

    @Override
    public String deletePlayerById(Integer id) {
       
        repo.deleteById(id);
        return "Player deleted with ID: " + id;
    }
    
    
    @Override
    public List<Object[]> getTotalMatchesByRole(String role) {
        return repo.findTotalMatchesByRole(role);
    }

}