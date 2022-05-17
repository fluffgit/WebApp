package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.model.geographicPlaces.*;
import com.example.webapp.repository.geographicPlacesRepository.EndPlaceRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndPlaceService {

    private EndPlaceRepository endPlaceRepository;

    public EndPlaceService(EndPlaceRepository endPlaceRepository) {
        this.endPlaceRepository = endPlaceRepository;
    }

    // add EndPlace
    public void addEndPlace(EndPlace endPlace) {
        endPlaceRepository.save(endPlace);
        System.out.println("added new endPlace o id " + endPlace.getId());
    }

    // edit EndPlace
    public void editEndPlace(EndPlace endPlace) {
        endPlaceRepository.save(endPlace);
    }

    // delete EndPlace
    public void deleteEndPlace(Long id) {
        endPlaceRepository.deleteById(id);
        System.out.println("deleting endPlace on id " + id);
    }

    // get EndPlace
    public EndPlace getEndPlace(Long id) {
        return endPlaceRepository.findById(id).orElse(null);
    }

    // get EndPlacesByCitys
    public List<EndPlace> getEndPlacesByCitys(City city) {
        return endPlaceRepository.findAll(Sort.by(String.valueOf(city.getNameCity())));
    }

    // get EndPlacesByHotel
    public List<EndPlace> getEndPlacesByHotel(Hotel hotel) {
        return endPlaceRepository.findAll(Sort.by(String.valueOf(hotel.getNameHotel())));
    }

    // get EndPlacesByAirport
    public List<EndPlace> getEndPlacesByAirport(Airport airport) {
        return endPlaceRepository.findAll(Sort.by(String.valueOf(airport.getNameAirport())));
    }
}
