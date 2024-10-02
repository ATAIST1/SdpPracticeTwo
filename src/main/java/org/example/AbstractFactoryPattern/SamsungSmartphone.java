package org.example.AbstractFactoryPattern;

public class SamsungSmartphone implements Smartphone {
    @Override
    public void getDetails() {
        System.out.println("Samsung Smartphone.");
    }
}
