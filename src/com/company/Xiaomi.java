package com.company;

public class Xiaomi extends Phone {
    public String model;
    public Xiaomi(String name, String OS, double screenSize, double cameraMegaPixels, int yearOfIssue, String model) {
        super(OS, screenSize, cameraMegaPixels, yearOfIssue, name);
        this.model = model;
    }
}