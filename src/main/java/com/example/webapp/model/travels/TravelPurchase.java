package com.example.webapp.model.travels;

import java.util.List;

public class TravelPurchase {

    long id;
    Travel travel;
    double price;
    List<TravelParticipants> listOfParticipants;

    public TravelPurchase(long id, Travel travel, double price, List<TravelParticipants> listOfParticipants) {
        this.id = id;
        this.travel = travel;
        this.price = price;
        this.listOfParticipants = listOfParticipants;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<TravelParticipants> getListOfParticipants() {
        return listOfParticipants;
    }

    public void setListOfParticipants(List<TravelParticipants> listOfParticipants) {
        this.listOfParticipants = listOfParticipants;
    }
}
