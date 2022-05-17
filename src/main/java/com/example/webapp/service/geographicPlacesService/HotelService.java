package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.repository.geographicPlacesRepository.HotelRepository;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
}
