package com.example.webapp.service.travelsService;

import com.example.webapp.repository.travelsRepository.TravelPurchaseRepository;
import org.springframework.stereotype.Service;

@Service
public class TravelPurchaseService {

    private TravelPurchaseRepository travelPurchaseRepository;

    public TravelPurchaseService(TravelPurchaseRepository travelPurchaseRepository) {
        this.travelPurchaseRepository = travelPurchaseRepository;
    }
}
