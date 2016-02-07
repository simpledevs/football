package com.simpledevs.football.controller;

import com.simpledevs.football.entity.Country;
import com.simpledevs.football.service.CountryManager;
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

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    @ResponseBody
    public List<Country> getAllCountries(ModelMap model) {
        return countryManager.getAllCountries();
    }

}
