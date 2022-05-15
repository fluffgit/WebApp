package com.example.webapp.model.geographicPlaces;

public class StartPlace {

    City city;
    Airport airport;

    public StartPlace(City city, Airport airport) {
        this.city = city;
        this.airport = airport;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
