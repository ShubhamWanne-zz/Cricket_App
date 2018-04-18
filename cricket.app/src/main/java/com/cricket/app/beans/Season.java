package com.cricket.app.beans;

public class Season {
	private int seasonId;
	private int seasonYear;
	private int orangeCapId;
	private int purpleCapId;
	private int manOfSeriesId;
	
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
	
	
}
