package dev.group2.presentation;

public class Zad6C {
    public static void main(String[] args) {
        String n1 = "\tAla\' \n ma " +
                "\nkota \"Tygyrs\" ";
        System.out.println(n1);

        System.out.println("Ala ma \r kota");
        System.out.println("Ala ma\bkota");

        System.out.println("Ala\b".length());

        System.out.println("\777");
        System.out.println(077);
        System.out.println("znak:\u003F");

//        CZY napis zawiera znak??
        System.out.println(
                "moj napis".contains("s"));
    }
}
