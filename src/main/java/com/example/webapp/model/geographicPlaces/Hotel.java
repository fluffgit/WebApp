package com.example.webapp.model.geographicPlaces;

import javax.persistence.*;

@Entity(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 30)
    private String nameHotel;
    @Column(length = 5)
    private int standard;
    @Column(length = 100)
    private String description;
    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public Hotel(Long id,String nameHotel, int standard, String description, Country country) {
        this.id = id;
        this.nameHotel = nameHotel;
        this.standard = standard;
        this.description = description;
        this.country = country;
    }

    public Hotel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
