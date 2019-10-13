package dev.group2.presentation;

import java.util.Arrays;

public class Zad6A {

    public static void main(String[] args) {
        String napis1 = "Hello";
        String napis2 = new String("Hello");

        System.out.println(napis1 == napis2);

        System.out.println(napis1 == "Hello");

        System.out.println(napis2 == new String("Hello"));

        System.out.println(napis1.equals(napis2));
        System.out.println(napis1.equalsIgnoreCase("HELLO"));

        System.out.println(napis1 + " " + "World");
        System.out.println(napis1.concat(" ").concat("World"));
        System.out.println(napis1);

        String name = "   Radek   ";
        String cleanName = name.trim();
        System.out.println(cleanName.length());

        String x = "A B C";
        System.out.println(x.replace(" ", ""));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.indexOf("R"));
        System.out.println(name.indexOf("X"));

        // podmienic litere
        String name1 = "Ala ma kota Anie";

        System.out.println(
                name1.replace("A", "O"));

        int pos = 5;
        name1 = name1.substring(0, pos)
                + "X" +
                name1.substring(pos + 1);
        System.out.println(name1);

        String name2 = "First Last";
        System.out.println(name2.substring(6, 8));

        String napis = "Moj wiek to 18lat";
        System.out.println(
                napis.replaceAll("[0-9]{2}",
                        "123"));

    }
}
