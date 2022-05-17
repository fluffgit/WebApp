package com.example.webapp.service.travelsService;

import com.example.webapp.repository.travelsRepository.TravelRepository;
import org.springframework.stereotype.Service;

@Service
public class TravelParticipantsService {

    private TravelRepository travelRepository;

    public TravelParticipantsService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }
}
