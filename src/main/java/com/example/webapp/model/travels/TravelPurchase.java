package com.example.webapp.model.travels;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "travelPurchase")
public class TravelPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "travelPurchase")
    private Set<Travel> travels = new HashSet<>();
    @Column(length = 15)
    private double price;
    @Column(length = 15)
    private Date dateBuy;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "travelPurchase")
    private Set<TravelParticipants> listOfParticipants = new HashSet<>();

    public TravelPurchase(long id, Set<Travel> travels, double price,Date dateBuy, Set<TravelParticipants> listOfParticipants) {
        this.id = id;
        this.travels = travels;
        this.price = price;
        this.dateBuy = dateBuy;
        this.listOfParticipants = listOfParticipants;
    }

    public TravelPurchase() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Travel> getTravels() {
        return travels;
    }

    public void setTravels(Set<Travel> travels) {
        this.travels = travels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(Date dateBuy) {
        this.dateBuy = dateBuy;
    }

    public Set<TravelParticipants> getListOfParticipants() {
        return listOfParticipants;
    }

    public void setListOfParticipants(Set<TravelParticipants> listOfParticipants) {
        this.listOfParticipants = listOfParticipants;
    }
}
