package com.company;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {
        generateRandomArray();generateRandomArray1();generateRandomArray2();task1();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[i];
            if (arr.length - 1 == i) {
                System.out.println("Сумма трат за месяц составила " + sum + " рублей");
                }
            }
            return arr;
        }

    int[] arr1 = generateRandomArray1();

    public static int[] generateRandomArray1() {
        java.util.Random random = new java.util.Random();
        int[] arr1 = new int[30];
        int minSum = 100000;
        int maxSum = -1;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100_000) + 100_000;
            if (arr1[i] > maxSum) {
                maxSum = arr1[i];
            } else {
                minSum = arr1[i];
        }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей." + " Максимальная сумма трат за день составила " + maxSum + " рублей");
        return arr1;
    }

    int[] arr2 = generateRandomArray2();

    public static int[] generateRandomArray2() {
        java.util.Random random = new java.util.Random();
        int[] arr2 = new int[30];
        double sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr2[i];
            double avargeSum = sum/30;
            if (arr2.length - 1 == i) {
                System.out.println("Средняя сумма трат за месяц составила " + avargeSum + " рублей");
            }
        }
        return arr2;
    }


    public static void task1() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length -1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }




    }


