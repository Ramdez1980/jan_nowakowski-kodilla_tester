package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int yearOfPublication;

    public void turnOn() {
        System.out.println("System is turned on");
    }

    public void turnOff() {
        System.out.println("System is turned off");
    }

    public OperatingSystem(int YearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getyearOfPublication() {
        return yearOfPublication;
    }

}