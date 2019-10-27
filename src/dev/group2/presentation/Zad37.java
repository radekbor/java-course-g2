package dev.group2.presentation;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Zad37 {

    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Map<String, String> map = new TreeMap<>(stringComparator);

        map.put("dwa", "xyz1");
        map.put("DWA", "xyz2");
        map.put("abcd", "xyz23");
        System.out.println(map);
    }
}
