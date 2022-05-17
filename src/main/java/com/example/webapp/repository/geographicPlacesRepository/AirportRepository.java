package com.example.webapp.repository.geographicPlacesRepository;

import com.example.webapp.model.geographicPlaces.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

}
