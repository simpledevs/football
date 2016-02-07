package com.simpledevs.football.repository;

import com.simpledevs.football.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
