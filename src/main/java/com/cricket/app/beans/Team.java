package com.cricket.app.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	@Id
	@Column(name="team_id")
	private Integer teamId;
	@Column(name="team_name")
	private String teamName;
	@Column(name="team_short_code")
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

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamShortName=" + teamShortName + "]";
	}
	
}
