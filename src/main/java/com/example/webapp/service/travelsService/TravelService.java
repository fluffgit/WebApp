package com.example.webapp.service.travelsService;

import com.example.webapp.model.geographicPlaces.City;
import com.example.webapp.model.geographicPlaces.Country;
import com.example.webapp.model.geographicPlaces.EndPlace;
import com.example.webapp.model.geographicPlaces.StartPlace;
import com.example.webapp.model.travels.Travel;
import com.example.webapp.model.travels.TravelPurchase;
import com.example.webapp.repository.travelsRepository.TravelRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {

    private TravelRepository travelRepository;

    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    // add Travel
    public void addTravel(Travel travel) {
        travelRepository.save(travel);
        System.out.println("added new travel o id " + travel.getId());
    }

    // edit Travel
    public void editTravel(Travel travel) {
        travelRepository.save(travel);
    }

    // delete Travel
    public void deleteTravel(Long id) {
        travelRepository.deleteById(id);
        System.out.println("deleting travel on id " + id);
    }

    // get Travel
    public Travel getTravel(Long id) {
        return travelRepository.findById(id).orElse(null);
    }

    // get TravelsByStartPlaceNameCity
    public List<Travel> getTravelsByStartPlaceNameCity(StartPlace startPlace) {
        return travelRepository.findAll(Sort.by(String.valueOf(startPlace.getCity().getNameCity())));
    }

    // get TravelsByStartPlaceAirport
    public List<Travel> getTravelsByStartPlaceAirport(StartPlace startPlace) {
        return travelRepository.findAll(Sort.by(String.valueOf(startPlace.getAirport().getNameAirport())));
    }

    // get TravelsByEndPlaceCity
    public List<Travel> getTravelsByEndPlaceCity(EndPlace endPlace) {
        return travelRepository.findAll(Sort.by(String.valueOf(endPlace.getCity().getNameCity())));
    }

    // get TravelsByEndPlaceHotel
    public List<Travel> getTravelsByEndPlaceHotel(EndPlace endPlace) {
        return travelRepository.findAll(Sort.by(String.valueOf(endPlace.getHotel().getNameHotel())));
    }

    // get TravelsByDateOut
    public List<Travel> getTravelsByDateOut(Travel travel) {
        return travelRepository.findAll(Sort.by(String.valueOf(travel.getDateOut())));
    }

    // get TravelsByDateIn
    public List<Travel> getTravelsByDateIn(Travel travel) {
        return travelRepository.findAll(Sort.by(String.valueOf(travel.getDateIn())));
    }

    // get TravelsByTravelType
    public List<Travel> getTravelsByTravelType(Travel travel) {
        return travelRepository.findAll(Sort.by(String.valueOf(travel.getTravelType().toString())));
    }

    // get TravelsByStandardHotel
    public List<Travel> getTravelsByStandardHotel(EndPlace endPlace) {
        return travelRepository.findAll(Sort.by(String.valueOf(endPlace.getHotel().getStandard())));
    }

    // get TravelsByDays
    public List<Travel> getTravelsByDays(Travel travel) {
        return travelRepository.findAll(Sort.by(String.valueOf(travel.getDays())));
    }

    // get TravelsByPrice
    public List<Travel> getTravelsByPrice(TravelPurchase travelPurchase) {
        return travelRepository.findAll(Sort.by(String.valueOf(travelPurchase.getPrice())));
    }

    // get TravelsByDateBuy
    public List<Travel> getTravelsByDateBuy(TravelPurchase travelPurchase) {
        return travelRepository.findAll(Sort.by(String.valueOf(travelPurchase.getDateBuy())));
    }
}
