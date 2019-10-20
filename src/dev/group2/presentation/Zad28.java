package dev.group2.presentation;

public class Zad28 {

    public static void main(String[] args) {

        System.out.println(PlanetyV2.Y.isCloserToSunThanEarth());
        System.out.println(PlanetyV2.X.isCloserToSunThanEarth());
        System.out.println(PlanetyV2.Z.isCloserToSunThanEarth());
    }
}

enum PlanetyV2 {

    X, Y {
        @Override
        boolean isCloserToSunThanEarth() {
            return true;
        }
    }, Z;

    boolean isCloserToSunThanEarth() {
        return false;
    }
}
