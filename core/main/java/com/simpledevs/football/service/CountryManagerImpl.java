package com.simpledevs.football.service;

import com.simpledevs.football.entity.Country;
import com.simpledevs.football.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryManagerImpl implements CountryManager {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional()
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
