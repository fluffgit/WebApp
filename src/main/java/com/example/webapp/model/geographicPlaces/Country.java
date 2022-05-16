package com.example.webapp.model.geographicPlaces;

import javax.persistence.*;

@Entity(name = "Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 30)
    private String nameCountry;
    @Column(length = 30)
    private Continent continent;

    public Country(long id, String nameCountry, Continent continent) {
        this.id = id;
        this.nameCountry = nameCountry;
        this.continent = continent;
    }

    public Country() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
