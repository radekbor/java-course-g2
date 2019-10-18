package dev.group2.practices.day2;

public class Task12 {

    public static void main(String[] args) {

        String s = "lorem ipsum sol ipsum sol del lore";

        String[] words = s.split(" ");

        int sum = 0;
        for(int i = 0;i<words.length;i++) {
            sum += words.length;
        }
        System.out.print("avg: " + sum/words.length);

    }
}
