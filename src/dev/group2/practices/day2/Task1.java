package dev.group2.practices.day2;

public class Task1 {

    public static void main(String[] args) {
        String napis = "Jakis dowolny napis";

        char[] chars = napis.toCharArray();
        int firstPosition = -1;
        for (int i = 0; i < chars.length; i++) {
            // znak na pozycji i to 's'
            // napis.charAt(i)
            if (chars[i] == 's') {
                firstPosition = i;
                break;
            }
        }
        System.out.println(firstPosition);

    }
}
