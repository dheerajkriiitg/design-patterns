package com.example.designpatterns.creational.simpleFactory;

// Factory class for creating instances of different types of vehicles
public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        switch (type) {
            case "car":
                return new CarVehicle();
            case "bike":
                return new BikeVehicle();
            case "truck":
                return new TruckVehicle();
            default:
                throw new IllegalArgumentException("Required vehicle type not provided");
        }
    }
}
