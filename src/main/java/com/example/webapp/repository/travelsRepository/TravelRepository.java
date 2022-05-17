package com.example.webapp.repository.travelsRepository;

import com.example.webapp.model.travels.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {

}
