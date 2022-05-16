package com.example.webapp.model.geographicPlaces;

import javax.persistence.*;

@Entity(name = "Airport")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String nameAirport;
    @OneToOne
    @JoinColumn(name = "Country_id")
    private Country country;

    public Airport(Long id, String nameAirport, Country country) {
        this.id = id;
        this.nameAirport = nameAirport;
        this.country = country;
    }

    public Airport() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
