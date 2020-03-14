package com.test.sap.config.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.test.sap.config.model.Standings;

@Service
public class StandingsService {

	/**
	 * Filter by Country
	 * @param standings
	 * @param name
	 * @return
	 */
	public List<Standings> getStandingByCountryName(List<Standings> standings, String name){
		
		return standings.stream().filter(s ->s.getCountryName().equals(name)).
				collect(Collectors.toList());
	}
	/**
	 * Filter by League
	 * @param standings
	 * @param name
	 * @return
	 */
	public List<Standings> getStandingByLeagueName(List<Standings> standings, String name){
		
		return standings.stream().filter(s ->s.getLeagueName().equals(name)).
				collect(Collectors.toList());
	}
	/**
	 *  Filter by Team 
	 * @param standings
	 * @param name
	 * @return
	 */
	public List<Standings> getStandingByTeamName(List<Standings> standings, String name){
	
	return standings.stream().filter(s ->s.getTeamName().equals(name)).
			collect(Collectors.toList());
	}
}
