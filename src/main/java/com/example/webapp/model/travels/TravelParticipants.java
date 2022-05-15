package com.example.webapp.model.travels;


public class TravelParticipants {

    long id;
    String name;
    String surname;
    int age;
    Travel travel;

    public TravelParticipants(long id, String name, String surname, int age, Travel travel) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.travel = travel;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
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
