package com.company;

import java.util.ArrayList;

public class Parts {

    //Data members
    private String partName;
    private String partType;
    private int partID;

    //Methods

    public Parts (int ID, String name, String type) {
        this.partID = ID;
        this.partName = name;
        this.partType = type;
    }

    public String setPartName(String partName) {
        this.partName = partName;
        return partName;
    }

    public String getPartName() {
        return partName;
    }

    public String setPartType(String partType) {
        this.partType = partType;
        return partType;
    }

    public String getPartType() {
        return partType;
    }

    public int setPartID(int partID) {
        this.partID = partID;
        return partID;
    }

    public int getPartID() {
        return partID;
    }

    public static void listParts(ArrayList<Parts> partList) {
        for (Parts part : partList) {
            System.out.println("Part ID: " + part.getPartID());
            System.out.println("Part Name: " + part.getPartName());
            System.out.println("Part Type: " + part.getPartType());
        }
    }
}
