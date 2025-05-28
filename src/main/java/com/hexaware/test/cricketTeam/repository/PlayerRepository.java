package com.hexaware.test.cricketTeam.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hexaware.test.cricketTeam.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
//	@Query("select sum(p.totalMatches) from Player p WHERE p.role = :role")
//    Integer findTotalMatchesByRole(@Param("role") String role);
	
	// enter role to display number of matches
	@Query("select p.playername, p.totalMatches from Player p where p.role = :role")
    List<Object[]> findTotalMatchesByRole(@Param("role") String role);



}
