package com.cricket.app.beans;

public class Team {
	private int teamId;
	private String teamName;
	private String teamShortName;
	
	public Team() {
		super();
	}

	public Team(int teamId, String teamName, String teamShortName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamShortName = teamShortName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamShortName() {
		return teamShortName;
	}

	public void setTeamShortName(String teamShortName) {
		this.teamShortName = teamShortName;
	}
	
}
