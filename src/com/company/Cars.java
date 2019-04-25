package com.company;

import java.util.ArrayList;

public class Cars {

    //Data members
    private int carID;
    private String make;
    private String model;
    private int year;
    private String color;
    private int MPG;
    private int horsePower;
    private int VIN;
    private double MSRP;
    private double dealerPrice;

    //Methods

    public Cars(int ID, String make, String model, int year, String color, int MPG, int horsePower, int VIN, double MSRP, double dealerPrice) {
        this.carID = ID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.MPG = MPG;
        this.horsePower = horsePower;
        this.VIN = VIN;
        this.MSRP = MSRP;
        this.dealerPrice = dealerPrice;
    }

    public void setID(int id) {
        this.carID = id;
    }
    public int getID() {
        return carID;
    }

    public String setMake(String make) {
        this.make = make;
        return make;
    }
    public String getMake() {
        return make;
    }
    public String setModel(String model) {
        this.model = model;
        return model;
    }
    public String getModel() {
        return model;
    }
    public int setYear(int year) {
        this.year = year;
        return year;
    }
    public int getYear() {
        return year;
    }
    public String setColor(String color) {
        this.color = color;
        return color;
    }
    public String getColor() {
        return color;
    }
    public int setMPG(int MPG) {
        this.MPG = MPG;
        return MPG;
    }
    public int getMPG() {
        return MPG;
    }
    public int setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return horsePower;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public int setVIN(int VIN) {
        this.VIN = VIN;
        return VIN;
    }
    public int getVIN() {
        return VIN;
    }
    public double setMSRP(double MSRP) {
        this.MSRP = MSRP;
        return MSRP;
    }
    public double getMSRP() {
        return MSRP;
    }
    public double setDealerPrice(double dealerPrice) {
        this.dealerPrice = dealerPrice;
        return dealerPrice;
    }
    public double getDealerPrice() {
        return dealerPrice;
    }

    public static void listCars(ArrayList<Cars> carList) {
        for (Cars car: carList) {
            System.out.println("Car ID: " + car.getID());
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println("Color: " + car.getColor());
            System.out.println("MPG: " + car.getMPG());
            System.out.println("Horse Power: " + car.getHorsePower());
            System.out.println("VIN: " + car.getVIN());
            System.out.println("MSRP: " + car.getMSRP());
            System.out.println("Dealer Price: " + car.getDealerPrice());
        }
    }
}