package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.repository.geographicPlacesRepository.StartPlaceRepository;
import org.springframework.stereotype.Service;

@Service
public class StartPlaceService {

    private StartPlaceRepository startPlaceRepository;

    public StartPlaceService(StartPlaceRepository startPlaceRepository) {
        this.startPlaceRepository = startPlaceRepository;
    }
}
