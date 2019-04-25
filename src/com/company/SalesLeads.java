package com.company;

import java.util.ArrayList;

public class SalesLeads {

    //Data members
    private String emplLastName;
    private String emplFirstName;
    private String custFirstName;
    private String custLastName;
    private int SalesLeadID;
    private int emplID;
    private double commission;
    private String SalesLeadDate;
    private double MSRP;
    private Boolean SalesLeadActive;

    //Methods

    public SalesLeads(int SalesLeadID, int emplID, String emplFirstName, String emplLastName, String custFirstName, String custLastName, double commission, String SalesLeadDate, double msrp, boolean SalesLeadActive) {
        this.emplFirstName = emplFirstName;
        this.emplLastName = emplLastName;
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
        this.SalesLeadID = SalesLeadID;
        this.emplID = emplID;
        this.commission = commission;
        this.SalesLeadDate = SalesLeadDate;
        this.MSRP = msrp;
        this.SalesLeadActive = SalesLeadActive;
    }

    public String getEmplFirstName() {
        return emplFirstName;
    }
    public void setEmplFirstName(String firstName) {
        this.emplFirstName = firstName;
    }
    public String getEmplLastName() {
        return emplLastName;
    }
    public void setEmplLastName(String lastName) {
        this.emplLastName = lastName;
    }
    public String getCustFirstName() {
        return custFirstName;
    }
    public void setCustFirstName(String _firstName) {
        this.custFirstName = _firstName;
    }
    public String getCustLastName() {
        return custLastName;
    }
    public void setLastName(String _lastName) {
        this.custLastName = _lastName;
    }
    public int getSalesLeadID() {
        return SalesLeadID;
    }
    public void setSalesLeadID(int _SalesLeadID) {
        this.SalesLeadID = _SalesLeadID;
    }
    public int getEmplID() {
        return emplID;
    }
    public void setEmplID(int _emplID) {
        this.emplID = _emplID;
    }
    public double getCommission() {
        return commission;
    }
    public void setCommission(int _commission) {
        this.commission = _commission;
    }
    public String getSalesDate() {
        return SalesLeadDate;
    }
    public void setSalesDate(String _SalesLeadDate) {
        this.SalesLeadDate = _SalesLeadDate;
    }
    public double getMSRP() {return MSRP;}
    public void setMSRP(double msrp) {this.MSRP = msrp;}
    public boolean getLeadActive() {
        return SalesLeadActive;
    }
    public void setEmplID(boolean _SalesLeadActive) {
        this.SalesLeadActive = _SalesLeadActive;
    }

    public static void listSalesLeads(ArrayList<SalesLeads> salesList) {
        for (SalesLeads leads : salesList) {
            System.out.println("Sale ID: " + leads.getSalesLeadID());
            System.out.println("Employee:\nEmployee ID: " + leads.getEmplID());
            System.out.println("First Name: " + leads.getEmplFirstName());
            System.out.println("Last Name: " + leads.getEmplLastName());
            System.out.println("Customer:\nCustomer First Name: " + leads.getCustFirstName());
            System.out.println("Last Name: " + leads.getCustLastName());
            System.out.println("Sale Details:\nCommission: " + leads.getCommission());
            System.out.println("Sale Lead Date: " + leads.getSalesDate());
            System.out.println("MSRP: " + leads.getMSRP());
            System.out.println("Sale Lead Active: " + leads.getLeadActive());
        }
    }

}
