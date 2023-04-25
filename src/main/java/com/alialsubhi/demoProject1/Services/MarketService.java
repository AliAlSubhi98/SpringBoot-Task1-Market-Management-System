package com.alialsubhi.demoProject1.Services;

import com.alialsubhi.demoProject1.Models.Market;
import com.alialsubhi.demoProject1.Repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {

    @Autowired
    MarketRepository marketRepository;

    public List<Market> getAllMarkets() {
        return marketRepository.findAll();
    }

    public Market getMarketById(long id){
        return marketRepository.findById(id).get();

    }
}
