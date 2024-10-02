package org.example.AbstractFactoryPattern;

interface DeviceFactory {
    Smartphone createSmartphone();
    Laptop createLaptop();
}