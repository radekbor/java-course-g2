package dev.group2.practices.day2;

public class Task7 {

    public static void main(String[] args) {
        int[] initArray  = new int[11];
        for (int i = 0; i < initArray.length; i++) {
            initArray[i] = i;
        }
        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < initArray.length; i++) {
            sum += initArray[i];
            if (i % 2 == 0) {
                evenSum += initArray[i];
            } else {
                oddSum += initArray[i];
            }
        }
        // mozna zrobic sume na koncu z evenSum + oddSum
        int avg = sum / initArray.length;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
        System.out.println("even sum: " + evenSum);
        System.out.println("odd sum: " + oddSum);
    }
}
