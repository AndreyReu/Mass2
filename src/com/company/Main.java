package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        generateRandomArray();
        task1();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        // Задание №1
        int[] arr = new int[30];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[i];
            if (arr.length - 1 == i) {
                System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            }
        }
        // Задание №2
        int minSum = 100000;
        int maxSum = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            } else {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей." + " Максимальная сумма трат за день составила " + maxSum + " рублей");
        //Задание №3
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[i];
            double avargeSum = sum / 30;
            if (arr.length - 1 == i) {
                System.out.println("Средняя сумма трат за месяц составила " + avargeSum + " рублей");
            }
        }
        return arr;
    }

    public static void task1() {
        // Задание №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


