package com.cricket.app.beans;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="player_match")
@NamedQueries({
	@NamedQuery(name="getMatchData",query="select PM from PlayerMatch PM inner join PM.team inner join PM.player where PM.id.matchId = :matchID")
})
public class PlayerMatch {
	@EmbeddedId
	private PKPlayerMatch id;
	@Column(name="is_keeper")
	private Integer isKeeper;
	@Column(name="is_captain")
	private Integer isCaptian;
	
	@ManyToOne
	@JoinColumn(name="team_id",insertable=false,updatable=false)
	private Team team;
	@ManyToOne
	@JoinColumn(name="player_id",insertable=false,updatable=false)
	private Player player;
	
	public PlayerMatch() {
		super();
	}

	public PlayerMatch(PKPlayerMatch id, Integer isKeeper, Integer isCaptian, Team team, Player player) {
		super();
		this.id = id;
		this.isKeeper = isKeeper;
		this.isCaptian = isCaptian;
		this.team = team;
		this.player = player;
	}

	public PKPlayerMatch getId() {
		return id;
	}

	public void setId(PKPlayerMatch id) {
		this.id = id;
	}

	public Integer getIsKeeper() {
		return isKeeper;
	}

	public void setIsKeeper(Integer isKeeper) {
		this.isKeeper = isKeeper;
	}

	public Integer getIsCaptian() {
		return isCaptian;
	}

	public void setIsCaptian(Integer isCaptian) {
		this.isCaptian = isCaptian;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "PlayerMatch [id=" + id + ", isKeeper=" + isKeeper + ", isCaptian=" + isCaptian + ", team=" + team
				+ ", player=" + player + "]";
	}
} 