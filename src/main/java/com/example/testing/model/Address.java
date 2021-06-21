package com.example.testing.model;

import java.io.Serializable;

public class Address implements Serializable {

    private String Address;

    public Address() {
    }

    public Address(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Address='" + Address + '\'' +
                '}';
    }
}
