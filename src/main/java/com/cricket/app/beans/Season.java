package com.cricket.app.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="season")
public class Season {
	@Id
	@Column(name="season_id")
	private Integer seasonId;
	@Column(name="season_year")
	private Integer seasonYear;
	@Column(name="orange_cap_id")
	private Integer orangeCapId;
	@Column(name="purple_cap_id")
	private Integer purpleCapId;
	@Column(name="man_of_the_series_id")
	private Integer manOfSeriesId;
	
	public Season() {
		super();
	}
	public Season(int seasonId, int seasonYear, int orangeCapId, int purpleCapId, int manOfSeriesId) {
		super();
		this.seasonId = seasonId;
		this.seasonYear = seasonYear;
		this.orangeCapId = orangeCapId;
		this.purpleCapId = purpleCapId;
		this.manOfSeriesId = manOfSeriesId;
	}
	
	public int getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}
	public int getSeasonYear() {
		return seasonYear;
	}
	public void setSeasonYear(int seasonYear) {
		this.seasonYear = seasonYear;
	}
	public int getOrangeCapId() {
		return orangeCapId;
	}
	public void setOrangeCapId(int orangeCapId) {
		this.orangeCapId = orangeCapId;
	}
	public int getPurpleCapId() {
		return purpleCapId;
	}
	public void setPurpleCapId(int purpleCapId) {
		this.purpleCapId = purpleCapId;
	}
	public int getManOfSeriesId() {
		return manOfSeriesId;
	}
	public void setManOfSeriesId(int manOfSeriesId) {
		this.manOfSeriesId = manOfSeriesId;
	}
	@Override
	public String toString() {
		return "Season [seasonId=" + seasonId + ", seasonYear=" + seasonYear + ", orangeCapId=" + orangeCapId
				+ ", purpleCapId=" + purpleCapId + ", manOfSeriesId=" + manOfSeriesId + "]";
	}
	
	
}
