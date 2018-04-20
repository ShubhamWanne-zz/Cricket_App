package com.cricket.app.dbservice;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cricket.app.beans.Match;
import com.cricket.app.beans.PlayerMatch;
import com.cricket.app.beans.Team;
import com.cricket.app.statsbeans.MatchTeam;

public class DBResourceUtil {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<MatchTeam> getData(int team_id,Session session){
		List<MatchTeam> matchTeamList = new ArrayList<MatchTeam>();
		Query query = session.createNamedQuery("RecordsByTeamID", Match.class);
		query.setParameter("teamID", team_id);
		List<Match> match_list = query.list();
		query=null;
		query = session.createQuery("from Team T where T.teamId = ?");
		query.setParameter(0, team_id);
		for(Match m : match_list){
			MatchTeam matchTeam = new MatchTeam();
			Team team = m.getTeam();
			matchTeam.setIsDuckworthlewis(m.getIsDuckworthlewis());
			matchTeam.setIsResult(m.getIsResult());
			matchTeam.setIsSuperOver(m.getIsSuperOver());
			matchTeam.setMatchDate(m.getMatchDate());
			matchTeam.setMatchId(m.getMatchId());
			matchTeam.setMatchWinnerId(m.getMatchWinnerId());
			matchTeam.setOpponentTeamId(m.getOpponentTeamId());
			matchTeam.setTeamId(team.getTeamId());
			matchTeam.setTeamName(team.getTeamName());
			matchTeam.setTeamNameId(m.getTeamNameId());
			matchTeam.setTossDecision(m.getTossDecision());
			matchTeam.setTossWinningId(m.getTossWinningId());
			matchTeam.setWinType(m.getWinType());
			if(matchTeam.getWinType().equals("Tie")){
				matchTeam.setWonBy(-1);
			}else{
				matchTeam.setWonBy(m.getWonBy());
			}
			Calendar cal = Calendar.getInstance(); cal.setTime(m.getMatchDate());
			matchTeam.setSeason(cal.get(Calendar.YEAR));
			matchTeamList.add(matchTeam);
			System.out.println("Match number : "+matchTeam.getMatchId()+" scanned successfully ");
		}
		return matchTeamList;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<MatchTeam> getData(int team_id,int opponent_id,Session session){
		List<MatchTeam> matchTeamList = new ArrayList<MatchTeam>();
		Query query = session.createNamedQuery("RecordsByTeamIDvsOpponentID", Match.class);
		query.setParameter("teamID", team_id);
		query.setParameter("opponentID", opponent_id);
		List<Match> match_list = query.list();
		query=null;
		query = session.createQuery("from Team T where T.teamId = ?");
		query.setParameter(0, team_id);
		for(Match m : match_list){
			MatchTeam matchTeam = new MatchTeam();
			Team team = m.getTeam();
			matchTeam.setIsDuckworthlewis(m.getIsDuckworthlewis());
			matchTeam.setIsResult(m.getIsResult());
			matchTeam.setIsSuperOver(m.getIsSuperOver());
			matchTeam.setMatchDate(m.getMatchDate());
			matchTeam.setMatchId(m.getMatchId());
			matchTeam.setMatchWinnerId(m.getMatchWinnerId());
			matchTeam.setOpponentTeamId(m.getOpponentTeamId());
			matchTeam.setTeamId(team.getTeamId());
			matchTeam.setTeamName(team.getTeamName());
			matchTeam.setTeamNameId(m.getTeamNameId());
			matchTeam.setTossDecision(m.getTossDecision());
			matchTeam.setTossWinningId(m.getTossWinningId());
			matchTeam.setWinType(m.getWinType());
			if(matchTeam.getWinType().equals("Tie")){
				matchTeam.setWonBy(-1);
			}else{
				matchTeam.setWonBy(m.getWonBy());
			}
			Calendar cal = Calendar.getInstance(); cal.setTime(m.getMatchDate());
			matchTeam.setSeason(cal.get(Calendar.YEAR));
			matchTeamList.add(matchTeam);
			System.out.println("Match number : "+matchTeam.getMatchId()+" scanned successfully ");
		}
		return matchTeamList;
	}
	/*
	 * To get Match-PlayerData
	 * e.g. who the the players of particular match
	 */
	public List<PlayerMatch> getMatchData(int matchID,Session session){
		List<PlayerMatch> matches = new ArrayList<PlayerMatch>();
		Query<PlayerMatch> query = session.createNamedQuery("getMatchData", PlayerMatch.class);
		query.setParameter("matchID", matchID);
		matches  = query.list();
		return matches;
	}

}
