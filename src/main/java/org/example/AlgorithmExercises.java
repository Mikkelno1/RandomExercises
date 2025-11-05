package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmExercises {

    public static void maxOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        int[] numbers = new int[3];
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int input = scanner.nextInt();
            numbers[i] = input;
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers) + " largest " + largest);
        scanner.close();
    }

    public static void arrayEvenAndOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input five numbers: ");
        int[] numbers = new int[5];
        int counterOdd = 0;
        int counterEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            int input = scanner.nextInt();
            numbers[i] = input;
            if (numbers[i] % 2 == 1) {
                counterOdd++;
            }
            if (numbers[i] % 2 == 0) {
                counterEven++;
            }
        }
        System.out.println(counterOdd + " are odd." + "\n" + counterEven + " are even." + "\n" + Arrays.toString(numbers));

    }

    public static void reverseOrder() {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length/2; i++) {
           int reverse = numbers[i];
           numbers[i] = numbers[numbers.length-1-i];
           numbers[numbers.length-1-i] = reverse;
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void reverseOrderHelper() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] temp = new int[5];

        for (int i = 0; i < numbers.length/2;i++) {
            temp[i] = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp[i];
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void palindrome() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] array = word.toCharArray();

        for (int i = 0; i < array.length;i++) {
            if (word.charAt(i) == word.charAt(array.length-1)){
                i++;
                System.out.println(word.charAt(i));
            }

        }
    }
}
