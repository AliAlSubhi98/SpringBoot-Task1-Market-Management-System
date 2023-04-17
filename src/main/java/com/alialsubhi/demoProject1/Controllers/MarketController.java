package com.alialsubhi.demoProject1.Controllers;

import com.alialsubhi.demoProject1.Models.Market;
import com.alialsubhi.demoProject1.Services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Market")
public class MarketController {

    @Autowired
    MarketService marketService;

    // http://localhost:8080/Market/getAll

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Market> getAllMarkets() {
        return marketService.getAllMarkets();
    }

}
