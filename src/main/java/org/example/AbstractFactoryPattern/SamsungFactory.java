package org.example.AbstractFactoryPattern;

public class SamsungFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }
    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
