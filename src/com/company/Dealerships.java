package com.company;

public class Dealerships {

// Data members

    private String city;
    private String state;
    private int zip;

//Methods

    public Dealerships(String city, String state, int zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public int getZip() {
        return zip;
    }
}
