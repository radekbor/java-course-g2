package dev.group2.presentation;

import sun.plugin.dom.exception.PluginNotSupportedException;

public class Zad23 {

    public static void main(String[] args) {
        Plane p = new Plane();
        p.addPassenger();
        short s = 20;
        p.addPassenger(s);
        byte b = 20;
        p.addPassenger(b);
        System.out.println(p.passengerNumber);
    }
}

class Plane {

    int passengerNumber;

    public void addPassenger() {
        passengerNumber++;
    }

    public void addPassenger(int n) {
        passengerNumber+=n;
    }

    public void addPassenger(short n) {
        passengerNumber+=n;
    }
}
