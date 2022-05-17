package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.repository.geographicPlacesRepository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
}
