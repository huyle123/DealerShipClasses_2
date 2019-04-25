package com.company;

import java.util.ArrayList;

public class Customers {
    //Data members
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int custID;
    private String phone;
    private String SSN;

    // Methods

    public Customers(int custID, String firstName, String lastName, String address, String email, String phone,String SSN) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.SSN = SSN;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public int getCustID() {
        return custID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    public static void listCustomers(ArrayList<Customers> custList) {
        for (Customers customer : custList) {
            System.out.println("Customer ID: " + customer.getCustID());
            System.out.println("First Name: " + customer.getFirstName());
            System.out.println("Last Name: " + customer.getLastName());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhone());
            System.out.println("SSN: " + customer.getSSN());
        }
    }
}
