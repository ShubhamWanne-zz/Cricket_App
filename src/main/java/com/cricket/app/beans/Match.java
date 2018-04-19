package com.cricket.app.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="match")
@NamedQueries({
	@NamedQuery(name="RecordsByTeamID",query = "FROM Match M where M.teamNameId = :teamID or M.opponentTeamId= :teamID"),
	@NamedQuery(name="RecordsByMatchID",query = "FROM Match M where M.matchId = :matchID")
})
public class Match {
	@Id
	@Column(name="match_id")
	private Integer matchId;
	@Temporal(TemporalType.DATE)
	@Column(name="match_date")
	private Date matchDate;
	@Column(name="team_name_id")
	private Integer teamNameId;
	@Column(name="opponent_team_id")
	private Integer opponentTeamId;
	@Column(name="season_id")
	private Integer seasonId;
	@Column(name="venue_name")
	private String venueName;
	@Column(name="toss_winner_id")
	private Integer tossWinningId;
	@Column(name="toss_decision")
	private String tossDecision;
	@Column(name="is_superover")
	private Integer isSuperOver;
	@Column(name="is_result")
	private Integer isResult;
	@Column(name="is_duckworthlewis")
	private Integer isDuckworthlewis;
	@Column(name="win_type")
	private String winType;
	@Column(name="won_by",nullable=true)
	private Integer wonBy;
	@Column(name="match_winner_id")
	private Integer matchWinnerId;
	@Column(name="man_of_the_match_id")
	private Integer manOfTheMatchId;
	@Column(name="first_umpire_id")
	private Integer firstUmpireId;
	@Column(name="second_umpire_id")
	private Integer secondUmpireId;
	@Column(name="city_name")
	private String cityName;
	@Column(name="host_country")
	private String hostCountry;
	
	public Match() {
		super();
	}

	public Match(int matchId, Date matchDate, int teamNameId, int opponentTeamId, int seasonId, String venueName,
			int tossWinningId, String tossDecision, int isSuperOver, int isResult, int isDuckworthlewis, String winType,
			int wonBy, int matchWinnerId, int manOfTheMatchId, int firstUmpireId, int secondUmpireId, String cityName,
			String hostCountry) {
		super();
		this.matchId = matchId;
		this.matchDate = matchDate;
		this.teamNameId = teamNameId;
		this.opponentTeamId = opponentTeamId;
		this.seasonId = seasonId;
		this.venueName = venueName;
		this.tossWinningId = tossWinningId;
		this.tossDecision = tossDecision;
		this.isSuperOver = isSuperOver;
		this.isResult = isResult;
		this.isDuckworthlewis = isDuckworthlewis;
		this.winType = winType;
		this.wonBy = wonBy;
		this.matchWinnerId = matchWinnerId;
		this.manOfTheMatchId = manOfTheMatchId;
		this.firstUmpireId = firstUmpireId;
		this.secondUmpireId = secondUmpireId;
		this.cityName = cityName;
		this.hostCountry = hostCountry;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public int getTeamNameId() {
		return teamNameId;
	}

	public void setTeamNameId(int teamNameId) {
		this.teamNameId = teamNameId;
	}

	public int getOpponentTeamId() {
		return opponentTeamId;
	}

	public void setOpponentTeamId(int opponentTeamId) {
		this.opponentTeamId = opponentTeamId;
	}

	public int getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public int getTossWinningId() {
		return tossWinningId;
	}

	public void setTossWinningId(int tossWinningId) {
		this.tossWinningId = tossWinningId;
	}

	public String getTossDecision() {
		return tossDecision;
	}

	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}

	public int getIsSuperOver() {
		return isSuperOver;
	}

	public void setIsSuperOver(int isSuperOver) {
		this.isSuperOver = isSuperOver;
	}

	public int getIsResult() {
		return isResult;
	}

	public void setIsResult(int isResult) {
		this.isResult = isResult;
	}

	public int getIsDuckworthlewis() {
		return isDuckworthlewis;
	}

	public void setIsDuckworthlewis(int isDuckworthlewis) {
		this.isDuckworthlewis = isDuckworthlewis;
	}

	public String getWinType() {
		return winType;
	}

	public void setWinType(String winType) {
		this.winType = winType;
	}

	public int getWonBy() {
		return wonBy;
	}

	public void setWonBy(int wonBy) {
		this.wonBy = wonBy;
	}

	public int getMatchWinnerId() {
		return matchWinnerId;
	}

	public void setMatchWinnerId(int matchWinnerId) {
		this.matchWinnerId = matchWinnerId;
	}

	public int getManOfTheMatchId() {
		return manOfTheMatchId;
	}

	public void setManOfTheMatchId(int manOfTheMatchId) {
		this.manOfTheMatchId = manOfTheMatchId;
	}

	public int getFirstUmpireId() {
		return firstUmpireId;
	}

	public void setFirstUmpireId(int firstUmpireId) {
		this.firstUmpireId = firstUmpireId;
	}

	public int getSecondUmpireId() {
		return secondUmpireId;
	}

	public void setSecondUmpireId(int secondUmpireId) {
		this.secondUmpireId = secondUmpireId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getHostCountry() {
		return hostCountry;
	}

	public void setHostCountry(String hostCountry) {
		this.hostCountry = hostCountry;
	}
	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", matchDate=" + matchDate + ", teamNameId=" + teamNameId
				+ ", opponentTeamId=" + opponentTeamId + ", seasonId=" + seasonId + ", venueName=" + venueName
				+ ", tossWinningId=" + tossWinningId + ", tossDecision=" + tossDecision + ", isSuperOver=" + isSuperOver
				+ ", isResult=" + isResult + ", isDuckworthlewis=" + isDuckworthlewis + ", winType=" + winType
				+ ", wonBy=" + wonBy + ", matchWinnerId=" + matchWinnerId + ", manOfTheMatchId=" + manOfTheMatchId
				+ ", firstUmpireId=" + firstUmpireId + ", secondUmpireId=" + secondUmpireId + ", cityName=" + cityName
				+ ", hostCountry=" + hostCountry + "]";
	}


	
}
