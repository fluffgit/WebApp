package com.example.webapp.service.travelsService;

import com.example.webapp.repository.travelsRepository.TravelRepository;
import org.springframework.stereotype.Service;

@Service
public class TravelService {

    private TravelRepository travelRepository;

    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }
}
