package com.simpledevs.football.service;

import com.simpledevs.football.entity.Team;
import com.simpledevs.football.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeamManagerImpl implements TeamManager {

    @Autowired
    private TeamRepository teamRepository;

    @Transactional
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }
}
