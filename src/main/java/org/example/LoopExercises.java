package org.example;

import java.util.Random;
import java.util.Scanner;

public class LoopExercises {


    public static void sumOfNumbers() {
        /*
        Ask for input (n), add numbers from one to n to a total
         */
        System.out.println("Enter an integer to get the sum from one to your number: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < input; i++) {
            total += i;
        }
        System.out.println("The sum is " + total);
    }

    public static void nestedMultiplication() {
    /*
    Print a multiplication table
    */
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int k = 1; k <= 10; k++) {
                int sum = i * k;
                System.out.print(sum + " ");
            }
        }
    }

    public static void rightAngledTriangle() {

        /*
        Print a right-angled triangle
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an integer to print the triangle: ");
        int answer = scanner.nextInt();

        for (int i = 0; i <= answer; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        for (int i = answer; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void evenOdd() {
        /*
        Print even and odd numbers
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an integer to print the odd and even numbers: ");
        int answer = scanner.nextInt();

        for (int number = 1; number <= answer; number++) {
            if (number % 2 == 0) {
                System.out.println(number + " even");
            } else {
                System.out.println(number + " odd");
            }
        }
    }

    public static void secretNumber() {
        /*
        Guess a random number
         */
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(25)+1;
        System.out.println("You have 5 guesses!");

        for (int i = 0; i < 5; i++) {
            System.out.println("Guess a number: ");
            int answer = scanner.nextInt();
            if (answer < randomNumber) {
                System.out.println("Too low!");
            } else if (answer > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct!");
                break;
            }
        }
    }

    public static void cupsOfCoffee(){
        int coffee = 12;
        for (int i = 12; i > 0; i--){
            coffee -= 1;
            System.out.println(coffee);
            if (coffee == 0){
                System.out.println("Done");
            }
        }
    }

    public static void cupsOfCoffeeDelivery(){
        int coffee = 12;
        int office = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                coffee -= 1;
                System.out.println(coffee);
            }
            System.out.println("Done with office " + office);
            office++;
        }

    }

    public static void newTriangle(){
        for (int i = 0; i < 4; i++){
            System.out.println();
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
        }
    }
}
