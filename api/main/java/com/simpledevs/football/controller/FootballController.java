package com.simpledevs.football.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class FootballController {

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    @ResponseBody
    public String getCountries(ModelMap model) {
        return "Country";
    }

}
