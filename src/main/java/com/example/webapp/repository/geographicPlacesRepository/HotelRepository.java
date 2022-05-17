package com.example.webapp.repository.geographicPlacesRepository;

import com.example.webapp.model.geographicPlaces.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
