package com.example.webapp.model.geographicPlaces;


public class City {

    String nameCity;
    Country country;

    public City(String nameCity, Country country) {
        this.nameCity = nameCity;
        this.country = country;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
