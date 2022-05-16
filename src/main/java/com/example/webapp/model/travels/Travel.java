package com.example.webapp.model.travels;
import com.example.webapp.model.geographicPlaces.EndPlace;
import com.example.webapp.model.geographicPlaces.StartPlace;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "travel")
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "travel")
    private Set<StartPlace> startPlaces = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "travel")
    private Set<EndPlace> endPlaces = new HashSet<>();
    @Column(length = 15)
    private Date dateOut;
    @Column(length = 15)
    private Date dateIn;
    @Column(length = 5)
    private int days;
    @Column(length = 5)
    private TravelType travelType;
    @Column(length = 10)
    private double priceForAnAdult;
    @Column(length = 10)
    private double priceForAChild;
    @Column(length = 10)
    private boolean promoted;
    @Column(length = 5)
    private int numberOfAdults;
    @Column(length = 5)
    private int numberOfChildren;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "travelParticipants_id")
    private TravelParticipants travelParticipants;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "travelPurchase_id")
    private TravelPurchase travelPurchase;

    public Travel(long id, Set<StartPlace> startPlaces, Set<EndPlace> endPlaces, Date dateOut, Date dateIn, int days,
                  TravelType travelType, double priceForAnAdult, double priceForAChild, boolean promoted,
                  int numberOfAdults, int numberOfChildren, TravelParticipants travelParticipants,
                  TravelPurchase travelPurchase) {
        this.id = id;
        this.startPlaces = startPlaces;
        this.endPlaces = endPlaces;
        this.dateOut = dateOut;
        this.dateIn = dateIn;
        this.days = days;
        this.travelType = travelType;
        this.priceForAnAdult = priceForAnAdult;
        this.priceForAChild = priceForAChild;
        this.promoted = promoted;
        this.numberOfAdults = numberOfAdults;
        this.numberOfChildren = numberOfChildren;
        this.travelParticipants = travelParticipants;
        this.travelPurchase = travelPurchase;
    }

    public Travel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<StartPlace> getStartPlaces() {
        return startPlaces;
    }

    public void setStartPlaces(Set<StartPlace> startPlaces) {
        this.startPlaces = startPlaces;
    }

    public Set<EndPlace> getEndPlaces() {
        return endPlaces;
    }

    public void setEndPlaces(Set<EndPlace> endPlaces) {
        this.endPlaces = endPlaces;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    public double getPriceForAnAdult() {
        return priceForAnAdult;
    }

    public void setPriceForAnAdult(double priceForAnAdult) {
        this.priceForAnAdult = priceForAnAdult;
    }

    public double getPriceForAChild() {
        return priceForAChild;
    }

    public void setPriceForAChild(double priceForAChild) {
        this.priceForAChild = priceForAChild;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public TravelParticipants getTravelParticipants() {
        return travelParticipants;
    }

    public void setTravelParticipants(TravelParticipants travelParticipants) {
        this.travelParticipants = travelParticipants;
    }

    public TravelPurchase getTravelPurchase() {
        return travelPurchase;
    }

    public void setTravelPurchase(TravelPurchase travelPurchase) {
        this.travelPurchase = travelPurchase;
    }
}
