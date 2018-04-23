package com.cricket.app.dbservice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cricket.app.beans.Match;
import com.cricket.app.beans.PlayerMatch;

public class DBResourceUtil {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Match> getData(int team_id,Session session){
		Query query = session.createNamedQuery("RecordsByTeamID", Match.class);
		query.setParameter("teamID", team_id);
		return query.list();
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Match> getData(int team_id,int opponent_id,Session session){
		Query query = session.createNamedQuery("RecordsByTeamIDvsOpponentID", Match.class);
		query.setParameter("teamID", team_id);
		query.setParameter("opponentID", opponent_id);
		return query.list();
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
