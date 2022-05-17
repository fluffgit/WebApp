package com.example.webapp.repository.travelsRepository;

import com.example.webapp.model.travels.TravelPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelPurchaseRepository extends JpaRepository<TravelPurchase, Long> {

}
