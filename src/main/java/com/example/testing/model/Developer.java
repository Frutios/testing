package com.example.testing.model;

public class Developer {

    private String name;
    private int xpYear;

    public Developer(String name, int xpYear) {
        this.name = name;
        this.xpYear = xpYear;
    }

    public Developer(String s) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXpYear() {
        return xpYear;
    }

    public void setXpYear(int xpYear) {
        this.xpYear = xpYear;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", xpYear=" + xpYear +
                '}';
    }
}
