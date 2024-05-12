package com.example.designpatterns.creational.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        System.out.println(car);
    }
}
