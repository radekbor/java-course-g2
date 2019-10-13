package dev.group2.presentation;

public class Zad7A {
    public static void main(String[] args) {

        StringBuilder builder =
                new StringBuilder("Hello");
        System.out.println(builder);

        builder.append(" World");
        System.out.println(builder);

        builder.insert(6, "X");
        System.out.println(builder);

        builder.replace(7, 10,
                "1234567");
        System.out.println(builder);

        String result = builder.toString();
        System.out.println(result);

        System.out.println(result.equals(builder));
        System.out.println(builder.equals(result));

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        System.out.println(builder1.equals(builder2));
        System.out.println(builder1.equals(builder1));
    }
}
