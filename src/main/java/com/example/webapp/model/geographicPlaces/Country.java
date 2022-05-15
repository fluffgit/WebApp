package com.example.webapp.model.geographicPlaces;


public class Country {

    String nameCountry;
    Continent continent;

    public Country(String nameCountry, Continent continent) {
        this.nameCountry = nameCountry;
        this.continent = continent;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
