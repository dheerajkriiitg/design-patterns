package com.example.designpatterns.creational.singleton;

// Singleton class implementing the Eager Initialization method
public class EagerRegistry {
    // Private constructor to prevent external instantiation
    private EagerRegistry() {
    }

    // Eagerly initialized instance of the singleton class
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    // Method to provide access to the singleton instance
    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
