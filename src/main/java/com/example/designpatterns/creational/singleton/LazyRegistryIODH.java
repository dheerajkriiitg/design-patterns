package com.example.designpatterns.creational.singleton;

// Singleton class implementing lazy initialization with Inner Class Holder (IODH)
// This ensures we have lazy initialization without the need for synchronization.
public class LazyRegistryIODH {

    // Private constructor to prevent external instantiation
    private LazyRegistryIODH() {
        System.out.println("In LazyRegistryIODH constructor");
    }

    // Inner class to hold the singleton instance, initialized during class loading
    private static class RegistryHolder {
        // Static instance variable initialized with the singleton instance
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    // Method to provide access to the singleton instance
    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}

