package com.hexaware.test.cricketTeam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "playerDetail")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;

    @NotBlank
    private String playername;

    
    private Integer jerseynumber;

    @NotBlank
    @Pattern(regexp = "Batsman|Bowler|Keeper|All Rounder")
    private String role;

    private Integer totalMatches;
    
    private String teamName;
    private String country;
    private String description;
    
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public Integer getJerseynumber() {
		return jerseynumber;
	}
	public void setJerseynumber(Integer jerseynumber) {
		this.jerseynumber = jerseynumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(Integer totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playername=" + playername + ", jerseynumber=" + jerseynumber
				+ ", role=" + role +"]";
	}
	

}
