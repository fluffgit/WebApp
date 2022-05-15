package com.example.webapp.model.geographicPlaces;


public class Airport {

    String nameAirport;
    Country country;

    public Airport(String nameAirport, Country country) {
        this.nameAirport = nameAirport;
        this.country = country;
    }

    public String getNameAirport() {
        return nameAirport;
    }

    public void setNameAirport(String nameAirport) {
        this.nameAirport = nameAirport;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
