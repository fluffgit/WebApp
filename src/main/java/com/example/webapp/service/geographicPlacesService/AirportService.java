package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.model.geographicPlaces.Airport;
import com.example.webapp.model.geographicPlaces.Country;
import com.example.webapp.repository.geographicPlacesRepository.AirportRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    private AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    // add Airport
    public void addAirport(Airport airport) {
        airportRepository.save(airport);
        System.out.println("added new airport o id " + airport.getId());
    }

    // edit Airport
    public void editAirport(Airport airport) {
        airportRepository.save(airport);
    }

    // delete Airport
    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
        System.out.println("deleting airport on id " + id);
    }

    // get Airport
    public Airport getAirport(Long id) {
        return airportRepository.findById(id).orElse(null);
    }

    // get Airports
    public List<Airport> getAirports(Country country) {
        return airportRepository.findAll(Sort.by(String.valueOf(country.getNameCountry())));
    }
}
