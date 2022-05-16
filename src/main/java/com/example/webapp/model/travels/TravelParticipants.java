package com.example.webapp.model.travels;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "TravelParticipants")
public class TravelParticipants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 30)
    private String name;
    @Column(length = 30)
    private String surname;
    @Column(length = 5)
    private int age;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "Travel")
    private Set<Travel> travels = new HashSet<>();


    public TravelParticipants(long id, String name, String surname, int age, Set<Travel> travels) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.travels = travels;
    }

    public TravelParticipants() {

    }

    public Set<Travel> getTravels() {
        return travels;
    }

    public void setTravels(Set<Travel> travels) {
        this.travels = travels;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
