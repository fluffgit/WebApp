package com.example.webapp.service.travelsService;

import com.example.webapp.model.geographicPlaces.Country;
import com.example.webapp.model.travels.TravelPurchase;
import com.example.webapp.repository.travelsRepository.TravelPurchaseRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelPurchaseService {

    private TravelPurchaseRepository travelPurchaseRepository;

    public TravelPurchaseService(TravelPurchaseRepository travelPurchaseRepository) {
        this.travelPurchaseRepository = travelPurchaseRepository;
    }

    // add TravelPurchase
    public void addTravelPurchase(TravelPurchase TravelPurchase) {
        travelPurchaseRepository.save(TravelPurchase);
        System.out.println("added new TravelPurchase o id " + TravelPurchase.getId());
    }

    // edit TravelPurchase
    public void editTravelPurchase(TravelPurchase TravelPurchase) {
        travelPurchaseRepository.save(TravelPurchase);
    }

    // delete TravelPurchase
    public void deleteTravelPurchase(Long id) {
        travelPurchaseRepository.deleteById(id);
        System.out.println("deleting TravelPurchase on id " + id);
    }

    // get TravelPurchase
    public TravelPurchase getTravelPurchase(Long id) {
        return travelPurchaseRepository.findById(id).orElse(null);
    }

    // get TravelPurchases
    public List<TravelPurchase> getTravelPurchases(TravelPurchase travelPurchase) {
        return travelPurchaseRepository.findAll(Sort.by(String.valueOf(travelPurchase.getPrice())));
    }
}
