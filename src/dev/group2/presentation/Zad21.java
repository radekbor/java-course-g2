package dev.group2.presentation;



public class Zad21 {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.startEngine();

        System.out.println(car instanceof Vehicle);
        System.out.println(car instanceof Car);

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle instanceof Car);
    }

}

class Car extends Vehicle {


    public void newMethod() {
        System.out.println("newMethod");
    }

    @Override
    public void startEngine() {
        System.out.println("Car.startEngine");
        super.startEngine();
    }

    @Override
    public void lightWarningLight() {
        System.out.println("Car.lightWarningLight");
    }

//    @Override
    private void supplyFuel() {
        System.out.println("Car.supplyFuel");
    }
}

class Vehicle {

    public void startEngine() {
        System.out.println("Vehicle.startEngine");
    }

    protected void lightWarningLight() {
        System.out.println("Vehicle.lightWarningLight");
    }

    private void supplyFuel() {
        System.out.println("Vehicle.supplyFuel");
    }
}