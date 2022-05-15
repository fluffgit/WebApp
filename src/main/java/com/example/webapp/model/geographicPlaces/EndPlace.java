package com.example.webapp.model.geographicPlaces;


public class EndPlace {

    City city;
    Hotel hotel;
    Airport airport;

    public EndPlace(City city, Hotel hotel, Airport airport) {
        this.city = city;
        this.hotel = hotel;
        this.airport = airport;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
