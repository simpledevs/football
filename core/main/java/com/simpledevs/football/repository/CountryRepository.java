package com.simpledevs.football.repository;

import com.simpledevs.football.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
