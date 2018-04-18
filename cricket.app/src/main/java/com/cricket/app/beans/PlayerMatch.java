package com.cricket.app.beans;

public class PlayerMatch {
	private int matchId;
	private int playerId;
	private int teamId;
	private int isKeeper;
	private int isCaptian;
	
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
	
}
