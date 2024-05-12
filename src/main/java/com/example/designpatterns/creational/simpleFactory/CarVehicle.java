package com.example.designpatterns.creational.simpleFactory;

public class CarVehicle extends Vehicle{
    private int doors;
    private int windows;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
}
