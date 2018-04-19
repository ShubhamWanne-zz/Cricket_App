package com.cricket.app.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player_match")
public class PlayerMatch {
	@Id
	@Column(name="match_id")
	private Integer matchId;
	//Player Id should also be primary key, will have to add composite id in future
	@Column(name="player_id")
	private Integer playerId;
	@Column(name="team_id")
	private Integer teamId;
	@Column(name="is_keeper")
	private Integer isKeeper;
	@Column(name="is_captain")
	private Integer isCaptian;
	
	public PlayerMatch() {
		super();
	}

	public PlayerMatch(int matchId, int playerId, int teamId, int isKeeper, int isCaptian) {
		super();
		this.matchId = matchId;
		this.playerId = playerId;
		this.teamId = teamId;
		this.isKeeper = isKeeper;
		this.isCaptian = isCaptian;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getIsKeeper() {
		return isKeeper;
	}

	public void setIsKeeper(int isKeeper) {
		this.isKeeper = isKeeper;
	}

	public int getIsCaptian() {
		return isCaptian;
	}

	public void setIsCaptian(int isCaptian) {
		this.isCaptian = isCaptian;
	}

	@Override
	public String toString() {
		return "PlayerMatch [matchId=" + matchId + ", playerId=" + playerId + ", teamId=" + teamId + ", isKeeper="
				+ isKeeper + ", isCaptian=" + isCaptian + "]";
	}
	
}
