package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    @Override
    public void turnOff()
    {
        System.out.println("Turn Off Linux system");/**/
    }



    @Override
    public void turnOn() {
        System.out.println("Turn On Linux system");
    }

    public Linux(int yearOfPublication)
    {super(yearOfPublication);}
}
