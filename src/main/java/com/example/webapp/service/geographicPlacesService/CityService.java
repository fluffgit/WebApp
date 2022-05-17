package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.model.geographicPlaces.City;
import com.example.webapp.model.geographicPlaces.Country;
import com.example.webapp.repository.geographicPlacesRepository.CityRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    // add City
    public void addCity(City city) {
        cityRepository.save(city);
        System.out.println("added new city o id " + city.getId());
    }

    // edit City
    public void editCity(City city) {
        cityRepository.save(city);
    }

    // delete City
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
        System.out.println("deleting city on id " + id);
    }

    // get City
    public City getCity(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    // get Citys
    public List<City> getCitys(Country country) {
        return cityRepository.findAll(Sort.by(String.valueOf(country.getNameCountry())));
    }
}
