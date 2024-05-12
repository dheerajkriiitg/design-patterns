package com.example.designpatterns.creational.singleton;

// Singleton class implementing the Lazy Initialization method without Double Checked Locking
// It will create multiple instances in a multi-threaded environment
public class LazyRegistryWithoutDCL {

    // Private constructor to prevent external instantiation
    private LazyRegistryWithoutDCL() {
        System.out.println("In LazyRegistryWithoutDCL constructor");
    }

    // Singleton instance variable, initially set to null
    private static LazyRegistryWithoutDCL INSTANCE;

    // Method to provide access to the singleton instance
    public static LazyRegistryWithoutDCL getInstance() {
        // Check if the instance is null before creating it
        if (INSTANCE == null) {
            // Instantiate the singleton object if it hasn't been created yet
            INSTANCE = new LazyRegistryWithoutDCL();
        }
        return INSTANCE;
    }
}
