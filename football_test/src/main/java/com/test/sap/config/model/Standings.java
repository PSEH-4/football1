package com.test.sap.config.model;

public class Standings {
	
	private String countryName;
	private String leagueName;
	private Long overallLeaguePosition;
	private String teamName;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public Long getOverallLeaguePosition() {
		return overallLeaguePosition;
	}
	public void setOverallLeaguePosition(Long overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}
	
}
