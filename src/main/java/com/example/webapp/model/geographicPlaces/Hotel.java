package com.example.webapp.model.geographicPlaces;


public class Hotel {

    String nameHotel;
    int standard;
    String description;
    Country country;

    public Hotel(String nameHotel, int standard, String description, Country country) {
        this.nameHotel = nameHotel;
        this.standard = standard;
        this.description = description;
        this.country = country;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
