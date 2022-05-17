package com.example.webapp.repository.geographicPlacesRepository;

import com.example.webapp.model.geographicPlaces.EndPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndPlaceRepository extends JpaRepository<EndPlace, Long> {

}
