package com.example.testing.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("house")
public class House {

    @Value("Joy, Tours 37000")
    private String address;
    @Value("25")
    private int nbWindow;
    @Value("9")
    private int nbDoor;
    @Value("Baker")
    private String owner;

    public House(String address, int nbWindow, int nbDoor, String owner){
        this.address=address;
        this.nbWindow=nbWindow;
        this.nbDoor=nbDoor;
        this.owner=owner;
    }

    public House() {

    }

    public int getNbWindow() {
        return nbWindow;
    }

    public void setNbWindow(int nbWindow) {
        this.nbWindow = nbWindow;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNbDoor() {
        return nbDoor;
    }

    public void setNbDoor(int nbDoor) {
        this.nbDoor = nbDoor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", nbWindow=" + nbWindow +
                ", nbDoor=" + nbDoor +
                ", owner='" + owner + '\'' +
                '}';
    }

}
