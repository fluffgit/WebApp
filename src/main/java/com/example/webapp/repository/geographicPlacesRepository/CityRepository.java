package com.example.webapp.repository.geographicPlacesRepository;

import com.example.webapp.model.geographicPlaces.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
