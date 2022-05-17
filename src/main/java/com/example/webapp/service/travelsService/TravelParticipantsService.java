package com.example.webapp.service.travelsService;

import com.example.webapp.model.travels.TravelParticipants;
import com.example.webapp.repository.travelsRepository.TravelParticipantsRepository;
import org.springframework.stereotype.Service;

@Service
public class TravelParticipantsService {

    private TravelParticipantsRepository travelParticipantsRepository;

    public TravelParticipantsService(TravelParticipantsRepository travelParticipantsRepository) {
        this.travelParticipantsRepository = travelParticipantsRepository;
    }

    // add TravelParticipants
    public void addTravelParticipants(TravelParticipants travelParticipants) {
        travelParticipantsRepository.save(travelParticipants);
        System.out.println("added new city o id " + travelParticipants.getId());
    }

    // edit TravelParticipants
    public void editTravelParticipants(TravelParticipants travelParticipants) {
        travelParticipantsRepository.save(travelParticipants);
    }

    // delete TravelParticipants
    public void deleteTravelParticipants(Long id) {
        travelParticipantsRepository.deleteById(id);
        System.out.println("deleting city on id " + id);
    }
}
