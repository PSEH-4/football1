package com.test.sap.config.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.sap.config.model.Standings;
import com.test.sap.config.service.StandingsService;

@Controller
public class LeagueController {
	
	@Autowired
	StandingsService standingsService;
	
	@GetMapping("/standings")
	public ResponseEntity<?> getStandings(
			@RequestParam(required=false) String countryName ,
			@RequestParam(required=false) String leagueName,
			@RequestParam(required=false) String teamName) {
		if(null == countryName && null == leagueName && null == teamName){
			return new ResponseEntity<String>("No content with specified parameters ", HttpStatus.NO_CONTENT);
		}
		// Get Standings from HTTP Client
		List<Standings> standings = new ArrayList<>();
		if(countryName != null){
			standingsService.getStandingByCountryName(standings, countryName);
		}
		else if(leagueName != null){
			standingsService.getStandingByLeagueName(standings, leagueName);
		}
		else{
			standingsService.getStandingByTeamName(standings, teamName);
		}
		return new ResponseEntity<>(standings, HttpStatus.OK);
	}
	

}
