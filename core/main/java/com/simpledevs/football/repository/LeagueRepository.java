package com.simpledevs.football.repository;

import com.simpledevs.football.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {
}
