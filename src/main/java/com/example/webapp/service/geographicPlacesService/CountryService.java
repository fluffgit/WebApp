package com.example.webapp.service.geographicPlacesService;

import com.example.webapp.model.geographicPlaces.Continent;
import com.example.webapp.model.geographicPlaces.Country;
import com.example.webapp.repository.geographicPlacesRepository.CountryRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    // add Country
        public void addCountry(Country country) {
            countryRepository.save(country);
            System.out.println("added new country o id " + country.getId());
        }

    // edit Country
    public void editCountry(Country country) { countryRepository.save(country);}

    // delete Country
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
        System.out.println("deleting country on id " + id);
    }

    // get Country
    public Country getCountry(Long id) {
        return countryRepository.findById(id).orElse(null);
    }

    // get Countrys
    public List<Country> getCountrys(Continent continent) {
        return countryRepository.findAll(Sort.by(String.valueOf(continent.toString())));
    }
}
