package com.cricket.app.beans;

import java.util.Date;

public class Player {
	private int playerId;
	private String playerName;
	private Date dob;
	private String battingHand;
	private String bowlingSkill;
	private String country;
	private int isUmpire;
	
	public Player() {
		super();
	}

	public Player(int playerId, String playerName, Date dob, String battingHand, String bowlingSkill, String country,
			int isUmpire) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.dob = dob;
		this.battingHand = battingHand;
		this.bowlingSkill = bowlingSkill;
		this.country = country;
		this.isUmpire = isUmpire;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getBattingHand() {
		return battingHand;
	}

	public void setBattingHand(String battingHand) {
		this.battingHand = battingHand;
	}

	public String getBowlingSkill() {
		return bowlingSkill;
	}

	public void setBowlingSkill(String bowlingSkill) {
		this.bowlingSkill = bowlingSkill;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getIsUmpire() {
		return isUmpire;
	}

	public void setIsUmpire(int isUmpire) {
		this.isUmpire = isUmpire;
	}
	
	
}
