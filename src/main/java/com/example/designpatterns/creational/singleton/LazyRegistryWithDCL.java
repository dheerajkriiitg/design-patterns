package com.example.designpatterns.creational.singleton;

// Singleton class implementing lazy initialization with Double-Checked Locking (DCL)
public class LazyRegistryWithDCL {

    // Private constructor to prevent external instantiation
    private LazyRegistryWithDCL() {
        System.out.println("In LazyRegistryWithDCL constructor");
    }

    // Singleton instance variable, marked as volatile to ensure proper visibility in a multi-threaded environment
    private static volatile LazyRegistryWithDCL INSTANCE;

    // Method to provide access to the singleton instance
    public static LazyRegistryWithDCL getInstance() {
        // Check if the instance is null before attempting to create it
        if (INSTANCE == null) {
            // Synchronize on the class to ensure only one thread creates the instance
            synchronized (LazyRegistryWithDCL.class) {
                // Double-check the instance inside the synchronized block to avoid race conditions
                if (INSTANCE == null) {
                    // Instantiate the singleton object if it hasn't been created yet
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}

