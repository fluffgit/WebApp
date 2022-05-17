package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.repository.geographicPlacesRepository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
}
