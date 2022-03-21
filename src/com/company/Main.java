package com.company;


public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Задание №1
    public static void task1() {
        int[] arr = generateRandomArray();
        int sumArr = 0;
        for (int j : arr) {
            sumArr += j;
        }
        {
            System.out.println("Сумма трат за месяц составила " + sumArr + " рублей");
        }
    }

    // Задание №2
    public static void task2() {
        int[] arr = generateRandomArray();
        int maxSum = -1;
        int minSum = arr[0];
        for (int j : arr) {
            if (j > maxSum) {
                maxSum = j;
            } else if (j < minSum) {
                minSum = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей." + " Максимальная сумма трат за день составила " + maxSum + " рублей");

    }

    //Задание №3
    public static void task3() {
        int[] arr = generateRandomArray();
        int sumArr = 0;
        for (int j : arr) {
            sumArr += j;
        }
        float avargeSum = (float) sumArr / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avargeSum + " рублей");


    }

    // Задание №4
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


