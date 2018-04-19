package com.cricket.app.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="player")
public class Player {
	@Id
	@Column(name="player_id")
	private Integer playerId;
	@Column(name="player_name")
	private String playerName;
	@Column(name="dob")
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name="batting_hand")
	private String battingHand;
	@Column(name="bowling_skill")
	private String bowlingSkill;
	@Column(name="country")
	private String country;
	@Column(name="is_umpire")
	private Integer isUmpire;
	
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

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", dob=" + dob + ", battingHand="
				+ battingHand + ", bowlingSkill=" + bowlingSkill + ", country=" + country + ", isUmpire=" + isUmpire
				+ "]";
	}
	
	
}
