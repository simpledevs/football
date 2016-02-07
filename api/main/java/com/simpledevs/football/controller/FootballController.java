package com.simpledevs.football.controller;

import com.simpledevs.football.entity.Country;
import com.simpledevs.football.entity.League;
import com.simpledevs.football.entity.Team;
import com.simpledevs.football.service.CountryManager;
import com.simpledevs.football.service.LeagueManager;
import com.simpledevs.football.service.TeamManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FootballController {

    @Autowired
    private CountryManager countryManager;

    @Autowired
    private LeagueManager leagueManager;

    @Autowired
    private TeamManager teamManager;

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    @ResponseBody
    public List<Country> getAllCountries(ModelMap model) {
        return countryManager.getAllCountries();
    }

    @RequestMapping(value = "/leagues", method = RequestMethod.GET)
    @ResponseBody
    public List<League> getAllLeagues(ModelMap model) {
        return leagueManager.getAllLeagues();
    }

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    @ResponseBody
    public List<Team> getAllTeams(ModelMap model) {
        return teamManager.getAllTeams();
    }
}
