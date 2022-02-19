package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
     Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;

    public Farm() {

    }
    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
       this.address = address;
       this.ownerName = ownerName;
       this.cows = cows;
       this.sheep = sheep;
       this.horses = horses;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
//    public void setCows(Cow[] cows) {
//        this.cows = cows;
//    }
//    public Cow[] getCows() {
//        return cows;
//    }
    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }
    public Sheep[] getSheep(){
        return sheep;
    }
    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }
    public Horse[] getHorses() {
        return horses;
    }

    @Override
    public String toString() {
        return "Address: " + getAddress() + ", owner name: " + getOwnerName();
    }
}
