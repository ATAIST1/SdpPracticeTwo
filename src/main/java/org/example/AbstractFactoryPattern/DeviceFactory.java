package org.example.AbstractFactoryPattern;

public interface DeviceFactory {
    Smartphone createSmartphone();
    Laptop createLaptop();
}