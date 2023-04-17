package com.alialsubhi.demoProject1.Repositories;

import com.alialsubhi.demoProject1.Models.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, Long> {

}
