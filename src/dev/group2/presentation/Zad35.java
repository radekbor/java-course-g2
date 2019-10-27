package dev.group2.presentation;

import java.util.ArrayList;
import java.util.List;

public class Zad35 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(3);

        System.out.println(list);
        Integer coUsunieto = list.remove(2);

        System.out.println(list);
        System.out.println(coUsunieto);

        try {
            list.remove(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        list.remove(Integer.valueOf(5));
        System.out.println(list);


    }
}
