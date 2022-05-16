package com.example.webapp.model.geographicPlaces;

import com.example.webapp.model.travels.Travel;

import javax.persistence.*;

@Entity(name = "endPlace")
public class EndPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;
    @OneToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    @OneToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "travel_id")
    private Travel travel;

    public EndPlace(long id, City city, Hotel hotel, Airport airport, Travel travel) {
        this.id = id;
        this.city = city;
        this.hotel = hotel;
        this.airport = airport;
        this.travel = travel;
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

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }
}
