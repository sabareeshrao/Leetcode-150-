public class Day4Solution {

    public static void main(String[] args) {

        // Question 1: Sum of all values
        int[] numbers1 = {4, 7, 2, 9, 5};
        int sum1 = 0;

        for (int number : numbers1) {
            sum1 += number;
        }

        System.out.println("Question 1 - Total sum: " + sum1);

        // Question 2: Sum of all negative values
        int[] numbers2 = {-3, -8, -1, -6};
        int sum2 = 0;

        for (int number : numbers2) {
            sum2 += number;
        }

        System.out.println("Question 2 - Total sum: " + sum2);

        // Question 3: Sum of only even values
        int[] numbers3 = {4, 7, 2, 9, 5};
        int evenSum3 = 0;

        for (int number : numbers3) {
            if (number % 2 == 0) {
                evenSum3 += number;
            }
        }

        System.out.println("Question 3 - Even-value sum: " + evenSum3);

        // Question 4: Sum of values stored at even indexes
        int[] numbers4 = {10, 20, 30, 40, 50};
        int evenIndexSum4 = 0;

        for (int i = 0; i < numbers4.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum4 += numbers4[i];
            }
        }

        System.out.println("Question 4 - Even-index sum: " + evenIndexSum4);

        // Question 5: Total, even, and odd sums
        int[] numbers5 = {12, 5, 18, 3, 10};
        int total5 = 0;
        int evenSum5 = 0;
        int oddSum5 = 0;

        for (int number : numbers5) {
            total5 += number;

            if (number % 2 == 0) {
                evenSum5 += number;
            } else {
                oddSum5 += number;
            }
        }

        System.out.println("Question 5 - Total sum: " + total5);
        System.out.println("Question 5 - Even-value sum: " + evenSum5);
        System.out.println("Question 5 - Odd-value sum: " + oddSum5);

        // Day 4 Challenge
        int[] challengeNumbers = {8, 3, 11, 4, 7, 6};
        int challengeTotal = 0;
        int greaterThanFiveSum = 0;
        int smallerThanFiveSum = 0;

        for (int number : challengeNumbers) {
            challengeTotal += number;

            if (number > 5) {
                greaterThanFiveSum += number;
            }

            if (number < 5) {
                smallerThanFiveSum += number;
            }
        }

        System.out.println("Challenge - Total sum: " + challengeTotal);
        System.out.println("Challenge - Sum greater than 5: " + greaterThanFiveSum);
        System.out.println("Challenge - Sum smaller than 5: " + smallerThanFiveSum);
    }
}
