package dev.group2.presentation;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Zad13 {




    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = Integer.valueOf(1);
        Integer i3 = Integer.valueOf(1);

        System.out.println(i1 == i2);
        System.out.println(i2 == i3);

        System.out.println(i1.equals(i2));

        System.out.println(i1.equals(1));
        System.out.println(i2.equals(1));

        System.out.println(i1 == 1);
        System.out.println(i2 == 1);

        int imaly = i1;
        System.out.println(imaly);

        Integer iduzy = imaly;
        System.out.println(iduzy);

        System.out.println(iduzy.compareTo(4));


    }

    boolean foo(Long l1, Long l2) {
        return l1.equals(l2);
    }
}
