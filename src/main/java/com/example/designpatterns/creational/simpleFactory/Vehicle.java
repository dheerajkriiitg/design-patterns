package com.example.designpatterns.creational.simpleFactory;

public abstract class Vehicle {
    private String name;
    private int seats;
    private int wheels;

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
