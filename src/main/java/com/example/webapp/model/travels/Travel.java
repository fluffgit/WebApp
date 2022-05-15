package com.example.webapp.model.travels;
import com.example.webapp.model.geographicPlaces.EndPlace;
import com.example.webapp.model.geographicPlaces.StartPlace;

import java.util.Date;


public class Travel {

    long id;
    StartPlace startPlace;
    EndPlace endPlace;
    Date dateOut;
    Date dateIn;
    int days;
    TravelType travelType;
    double priceForAnAdult;
    double priceForAChild;
    boolean promoted;
    int numberOfAdults;
    int numberOfChildren;

    public Travel(long id, StartPlace startPlace, EndPlace endPlace, Date dateOut, Date dateIn, int days,
                  TravelType travelType, double priceForAnAdult, double priceForAChild, boolean promoted,
                  int numberOfAdults, int numberOfChildren) {
        this.id = id;
        this.startPlace = startPlace;
        this.endPlace = endPlace;
        this.dateOut = dateOut;
        this.dateIn = dateIn;
        this.days = days;
        this.travelType = travelType;
        this.priceForAnAdult = priceForAnAdult;
        this.priceForAChild = priceForAChild;
        this.promoted = promoted;
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StartPlace getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(StartPlace startPlace) {
        this.startPlace = startPlace;
    }

    public EndPlace getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(EndPlace endPlace) {
        this.endPlace = endPlace;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    public double getPriceForAnAdult() {
        return priceForAnAdult;
    }

    public void setPriceForAnAdult(double priceForAnAdult) {
        this.priceForAnAdult = priceForAnAdult;
    }

    public double getPriceForAChild() {
        return priceForAChild;
    }

    public void setPriceForAChild(double priceForAChild) {
        this.priceForAChild = priceForAChild;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

}
