package org.example;

import java.util.Arrays;

public class ArrayExercises {

    public static void arraySortingBoolean() {
        int[] firstArray = {56, 78, 1, 102, 14, 42, 8, 65, 78, 100};
        int[] secondArray = new int[firstArray.length];
        boolean[] used = new boolean[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            int comparisonValue = 0;
            int indexOfSmallest = -1;

            for (int j = 0; j < firstArray.length; j++) {
                if (!used[j]) {
                    comparisonValue = firstArray[j];
                    indexOfSmallest = j;
                    break;
                }
            }
            for (int j = 0; j < firstArray.length; j++) {
                if (!used[j] && firstArray[j] < comparisonValue) {
                    comparisonValue = firstArray[j];
                    indexOfSmallest = j;
                }
            }
            used[indexOfSmallest] = true;
            secondArray[i] = comparisonValue;
        }
        System.out.println(Arrays.toString(secondArray));
    }


    public static void arraySorting() {
        int[] unsortedNos= {5,2,7,1,8,10,9,9};
        int[] sortedNos = new int[unsortedNos.length];

        for (int i = 0; i < unsortedNos.length;i++){
            int min = unsortedNos[i];
            int index = i;

            for (int j = 0; j < unsortedNos.length;j++){
                if (min > unsortedNos[j]) {
                    min = unsortedNos[j];
                    index = j;
                }
            }
            sortedNos[i] = min;
            unsortedNos[index] = 100;
        }
        System.out.println(Arrays.toString(sortedNos));
    }



    public static void arraySortingMathMin() {
        int[] firstArray = {56, 78, 1, 102, 14, 42, 8, 65, 78, 100};
        int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            int comparisonNumber = 999999;
            int index = -1;

            for (int j = 0; j < firstArray.length; j++) {
                int size = Math.min(comparisonNumber, firstArray[j]);
                if (firstArray[j] < comparisonNumber) {
                    comparisonNumber = size;
                    index = j;
                }
            }
            secondArray[i] = comparisonNumber;
            firstArray[index] = 999999;
        }
        System.out.println(Arrays.toString(secondArray));
    }

    public static void arrayPrint() {
        int[] numbers = {4, 7, 2, 9, 1};

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void arraySum() {
        int[] numbers = {4, 7, 2, 9, 1};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println(sum);
    }

    public static void arrayLargest() {
        int[] numbers = {4, 7, 2, 9, 1};
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);

    }

    public static void evenNumbers() {
        int[] numbers = {4, 7, 2, 9, 1};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

    }

    public static void arrayCopy() {
        int[] numbers = {4, 7, 2, 9, 1};
        int[] copy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }
        System.out.println(Arrays.toString(copy));
    }

    public static void arrayTwiceValue() {
        int[] numbers = {4, 7, 2, 9, 1};
        int[] copy = new int[numbers.length];
        int multiplication;

        for (int i = 0; i < numbers.length; i++) {
            multiplication = numbers[i] * 2;
            copy[i] = multiplication;
        }
        System.out.println(Arrays.toString(copy));
    }

    public static void arrayReverse() {
        int[] numbers = {4, 7, 2, 9, 1};

        for (int i = 0; i < numbers.length/2; i++) {
            int reverse = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = reverse;
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void arrayIndexSmallest() {
        int[] numbers = {4, 7, 2, 9, 1};
        int smallest = numbers[0];
        int position = 0;

        for (int i = 0; i < numbers.length;i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                position = i;
                
            }
        }
        System.out.println(smallest + " at position " + position);
    }

    public static void arrayPositionSwap() {
        int[] numbers = {4, 7, 2, 9, 1};

        int firstIndex = numbers[0];
        numbers[0] =  numbers[numbers.length-1];
        numbers[numbers.length-1] = firstIndex;

        System.out.println(Arrays.toString(numbers));
    }

    public static void arraySwitchToRight() {
        int[] numbers = {4, 7, 2, 9, 1};
        int last = numbers[numbers.length-1];

        for (int i = numbers.length-1; i > 0;i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[0] = last;
        System.out.println(Arrays.toString(numbers));


    }

    public static void arraySmallestAndLargest() {
        int[] numbers = {4, 7, 2, 9, 1};
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length;i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest: " + smallest + " and largest: " + largest);
    }

    public static void arrayHowManyAboveAverage() {
        int[] numbers = {4, 7, 2, 9, 1};
        double sum = 0;
        int counter = 0;

        for (int i = 0; i < numbers.length;i++) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;

        for (int i = 0; i < numbers.length;i++) {
            if (numbers[i] > average) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void arrayDouble() {
        int[] scores = {5,8,2,10};

        for (int i = 0; i < scores.length; i++){
            scores[i] = scores[i]*2;
            System.out.println(scores[i]);
        }
    }

    public static void arrayGrades(){
        int[] grades = {55,72,89,41,63};
        double sum = 0;
        double average;

        for (int i = 0; i < grades.length; i++){
            grades[i] = grades[i]+5;
            sum += grades[i];
        }
        average = sum / grades.length;
        if (average >= 60){
            System.out.println(average);
            System.out.println("Class passed!");
        } else {
            System.out.println("Class failed");
        }

    }

    public static void twoDArrayTriangle(){
        int row = 4;
        int column = 4;

        String [][] triangle = new String[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (j <= i) {
                    triangle[i][j] = "*";
                } else {
                    triangle[i][j] = " ";
                }
                System.out.printf("%2s", triangle[i][j]);
            }
            System.out.println();
        }

    }






}
