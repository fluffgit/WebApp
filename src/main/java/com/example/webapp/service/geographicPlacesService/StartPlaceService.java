package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.model.geographicPlaces.Airport;
import com.example.webapp.model.geographicPlaces.City;
import com.example.webapp.model.geographicPlaces.StartPlace;
import com.example.webapp.repository.geographicPlacesRepository.StartPlaceRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StartPlaceService {

    private StartPlaceRepository startPlaceRepository;

    public StartPlaceService(StartPlaceRepository startPlaceRepository) {
        this.startPlaceRepository = startPlaceRepository;
    }

    // add StartPlace
    public void addStartPlace(StartPlace startPlace) {
        startPlaceRepository.save(startPlace);
        System.out.println("added new startPlace o id " + startPlace.getId());
    }

    // edit StartPlace
    public void editStartPlace(StartPlace startPlace) {
        startPlaceRepository.save(startPlace);
    }

    // delete StartPlace
    public void deleteStartPlace(Long id) {
        startPlaceRepository.deleteById(id);
        System.out.println("deleting startPlace on id " + id);
    }

    // get StartPlace
    public StartPlace getStartPlace(Long id) {
        return startPlaceRepository.findById(id).orElse(null);
    }

    // get StartPlacesByCitys
    public List<StartPlace> getStartPlacesByCitys(City city) {
        return startPlaceRepository.findAll(Sort.by(String.valueOf(city.getNameCity())));
    }

    // get StartPlacesByAirports
    public List<StartPlace> getStartPlacesByAirports(Airport airport) {
        return startPlaceRepository.findAll(Sort.by(String.valueOf(airport.getNameAirport())));
    }
}
