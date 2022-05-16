package com.example.webapp.model.geographicPlaces;

import javax.persistence.*;

@Entity(name = "StartPlace")
public class StartPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "City_id")
    private City city;
    @OneToOne
    @JoinColumn(name = "Airport_id")
    private Airport airport;

    public StartPlace(long id, City city, Airport airport) {
        this.id = id;
        this.city = city;
        this.airport = airport;
    }

    public StartPlace() {

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

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
