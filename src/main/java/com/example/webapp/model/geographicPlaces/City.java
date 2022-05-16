package com.example.webapp.model.geographicPlaces;

import javax.persistence.*;

@Entity(name = "City")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(length = 30)
    private String nameCity;
    @OneToOne
    @JoinColumn(name = "Country_id")
    private Country country;

    public City(String nameCity, Country country) {
        this.nameCity = nameCity;
        this.country = country;
    }

    public City() {

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
