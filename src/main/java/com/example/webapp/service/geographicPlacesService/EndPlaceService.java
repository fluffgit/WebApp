package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.repository.geographicPlacesRepository.EndPlaceRepository;
import org.springframework.stereotype.Service;

@Service
public class EndPlaceService {

    private EndPlaceRepository endPlaceRepository;

    public EndPlaceService(EndPlaceRepository endPlaceRepository) {
        this.endPlaceRepository = endPlaceRepository;
    }
}
