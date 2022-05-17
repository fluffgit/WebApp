package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.model.geographicPlaces.City;
import com.example.webapp.model.geographicPlaces.Country;
import com.example.webapp.model.geographicPlaces.Hotel;
import com.example.webapp.repository.geographicPlacesRepository.HotelRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    // add Hotel
    public void addHotel(Hotel hotel) {
        hotelRepository.save(hotel);
        System.out.println("added new hotel o id " + hotel.getId());
    }

    // edit Hotel
    public void editHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    // delete Hotel
    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
        System.out.println("deleting hotel on id " + id);
    }

    // get Hotel
    public Hotel getHotel(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    // get HotelsByNameHotel
    public List<Hotel> getHotelsByNameHotel(Hotel hotel) {
        return hotelRepository.findAll(Sort.by(String.valueOf(hotel.getNameHotel())));
    }

    // get HotelsByStandard
    public List<Hotel> getHotelsByStandard(Hotel hotel) {
        return hotelRepository.findAll(Sort.by(String.valueOf(hotel.getStandard())));
    }

    // get HotelsByCountry
    public List<Hotel> getHotelsByCountry(Country country) {
        return hotelRepository.findAll(Sort.by(String.valueOf(country.getNameCountry())));
    }
}
