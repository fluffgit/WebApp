package com.example.webapp.repository.travelsRepository;

import com.example.webapp.model.travels.TravelParticipants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelParticipantsRepository extends JpaRepository<TravelParticipants, Long> {

}
