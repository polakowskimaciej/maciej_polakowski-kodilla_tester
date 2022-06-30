package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1992);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows windows = new Windows(1998);
        windows.turnOn();
        windows.turnOff();

        Linux linux = new Linux(2012);
        linux.turnOn();
        linux.turnOff();
    }
}
