package dev.group2.revision;

public class Test1 {

    public static void main(String[] args) {
        byte odp1 = 2 * 2;
        int two = 2;
        // byte odp2 = two * two; nie wolno!!!
        final int finalTwo = 2;
        byte odp3 = finalTwo * finalTwo;
        // wolno bo zmienne final sa obliczane
        // w trakcie kompilacji i jest pewne ze sie zmiesci
        final byte oneTwoSeven = 127;
        // byte odp4 = oneTwoSeven + oneTwoSeven;
        // nie wolno bo zmienne final sa obliczane
        // w trakcie kompilacji i jest pewne ze sie zmiesci

        final byte fifty = 50;
        byte odp5 = fifty + fifty;
    }
}
