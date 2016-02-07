package com.simpledevs.football.controller;

import com.simpledevs.football.entity.Country;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FootballController {

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    @ResponseBody
    public Country getCountries(ModelMap model) {
        return getMock();
    }

    public Country getMock() {
        final Country country = new Country();
        country.setId(1);
        country.setName("USA");
        return country;
    }
}
