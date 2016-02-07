package com.simpledevs.football.service;

import com.simpledevs.football.entity.League;
import com.simpledevs.football.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LeagueManagerImpl implements LeagueManager {

    @Autowired
    private LeagueRepository leagueRepository;

    @Transactional
    public List<League> getAllLeagues() {
        return leagueRepository.findAll();
    }
}
