package com.cricket.app.statsbeans;

import java.util.Date;


public class MatchTeam {
	
	private Integer matchId;
	private Date matchDate;
	private Integer teamNameId;
	private Integer opponentTeamId;
	private Integer tossWinningId;
	private String tossDecision;
	private Integer isSuperOver;
	private Integer isResult;
	private Integer isDuckworthlewis;
	private String winType;
	private Integer wonBy;
	private Integer matchWinnerId;
	private Integer teamId;
	private String teamName;
	private Integer season;
	
	
	public Integer getSeason() {
		return season;
	}
	public void setSeason(Integer season) {
		this.season = season;
	}
	public Integer getMatchId() {
		return matchId;
	}
	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public Integer getTeamNameId() {
		return teamNameId;
	}
	public void setTeamNameId(Integer teamNameId) {
		this.teamNameId = teamNameId;
	}
	public Integer getOpponentTeamId() {
		return opponentTeamId;
	}
	public void setOpponentTeamId(Integer opponentTeamId) {
		this.opponentTeamId = opponentTeamId;
	}
	public Integer getTossWinningId() {
		return tossWinningId;
	}
	public void setTossWinningId(Integer tossWinningId) {
		this.tossWinningId = tossWinningId;
	}
	public String getTossDecision() {
		return tossDecision;
	}
	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}
	public Integer getIsSuperOver() {
		return isSuperOver;
	}
	public void setIsSuperOver(Integer isSuperOver) {
		this.isSuperOver = isSuperOver;
	}
	public Integer getIsResult() {
		return isResult;
	}
	public void setIsResult(Integer isResult) {
		this.isResult = isResult;
	}
	public Integer getIsDuckworthlewis() {
		return isDuckworthlewis;
	}
	public void setIsDuckworthlewis(Integer isDuckworthlewis) {
		this.isDuckworthlewis = isDuckworthlewis;
	}
	public String getWinType() {
		return winType;
	}
	public void setWinType(String winType) {
		this.winType = winType;
	}
	public Integer getWonBy() {
		return wonBy;
	}
	public void setWonBy(Integer wonBy) {
		this.wonBy = wonBy;
	}
	public Integer getMatchWinnerId() {
		return matchWinnerId;
	}
	public void setMatchWinnerId(Integer matchWinnerId) {
		this.matchWinnerId = matchWinnerId;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public String toString() {
		return "MatchTeam [matchId=" + matchId + ", matchDate=" + matchDate + ", teamNameId=" + teamNameId
				+ ", opponentTeamId=" + opponentTeamId + ", tossWinningId=" + tossWinningId + ", tossDecision="
				+ tossDecision + ", isSuperOver=" + isSuperOver + ", isResult=" + isResult + ", isDuckworthlewis="
				+ isDuckworthlewis + ", winType=" + winType + ", wonBy=" + wonBy + ", matchWinnerId=" + matchWinnerId
				+ ", teamId=" + teamId + ", teamName=" + teamName + ", season=" + season + "]";
	}
	
	
}
