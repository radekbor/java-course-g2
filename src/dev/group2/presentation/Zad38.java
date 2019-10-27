package dev.group2.presentation;

import java.util.*;
import java.util.regex.Matcher;

public class Zad38 {

    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>();
        imiona.add("Jan");
        imiona.add("Stas");
        imiona.add("Alina");

        for (String imie : imiona) {
            System.out.println(imie);
        }

        System.out.println("----");
        Set<String> imiona2 = new HashSet<>(imiona);
        for(String imie: imiona2) {
            System.out.println(imie);
        }

        System.out.println("----");
        Map<String, Integer> wiek = new HashMap<>();
        wiek.put("Jan", 32);
        wiek.put("Olek", 18);

        for(Map.Entry<String, Integer> entry: wiek.entrySet()) {
            System.out.println(entry);
        }

    }
}
