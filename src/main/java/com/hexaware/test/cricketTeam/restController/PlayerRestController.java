package com.hexaware.test.cricketTeam.restController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.test.cricketTeam.entity.Player;
import com.hexaware.test.cricketTeam.exception.PlayerNotFoundException;
import com.hexaware.test.cricketTeam.service.IPlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerRestController {

    @Autowired
    IPlayerService service;

    @GetMapping
    public List<Player> getAllPlayers() {
        return service.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Integer id) {
        Player player = service.getPlayerById(id);
        if (player == null) {
            throw new PlayerNotFoundException();
        }
        return player;
    }

    @PostMapping
    public Player addPlayer( @RequestBody Player player) {
        return service.addPlayer(player);
    }

    @PutMapping("/{id}")
    public Player updatePlayer(@PathVariable Integer id,@RequestBody Player player) {
        if (service.getPlayerById(id) == null) {
            throw new PlayerNotFoundException();
        }
        
        return service.updatePlayer(id,player);
    }

    @DeleteMapping("/{id}")
    public String deletePlayer(@PathVariable Integer id) {
        if (service.getPlayerById(id) == null) {
            throw new PlayerNotFoundException();
        }
        return service.deletePlayerById(id);
    }
    
    // enter role to display number of matches
    @GetMapping("/totalMatches/{role}")
    public List<Object[]> getTotalMatchesByRole(@PathVariable String role) {
        return service.getTotalMatchesByRole(role);
    }

}