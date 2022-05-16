package com.example.webapp.model.geographicPlaces;

import javax.persistence.*;

@Entity(name = "EndPlace")
public class EndPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "City_id")
    private City city;
    @OneToOne
    @JoinColumn(name = "Hotel_id")
    private Hotel hotel;
    @OneToOne
    @JoinColumn(name = "Airport_id")
    private Airport airport;

    public EndPlace(long id, City city, Hotel hotel, Airport airport) {
        this.id = id;
        this.city = city;
        this.hotel = hotel;
        this.airport = airport;
    }

    public EndPlace() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
