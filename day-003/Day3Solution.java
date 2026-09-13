public class Day3Solution {

    public static void main(String[] args) {

        // Question 1: Largest value
        int[] numbers1 = {4, 7, 2, 9, 5};
        int largest1 = numbers1[0];

        for (int i = 1; i < numbers1.length; i++) {
            if (numbers1[i] > largest1) {
                largest1 = numbers1[i];
            }
        }

        System.out.println("Question 1 - Largest value: " + largest1);

        // Question 2: Largest value with all-negative numbers
        int[] numbers2 = {-3, -8, -1, -6};
        int largest2 = numbers2[0];

        for (int i = 1; i < numbers2.length; i++) {
            if (numbers2[i] > largest2) {
                largest2 = numbers2[i];
            }
        }

        System.out.println("Question 2 - Largest value: " + largest2);

        // Question 3: Smallest value
        int[] numbers3 = {4, 7, 2, 9, 5};
        int smallest3 = numbers3[0];

        for (int i = 1; i < numbers3.length; i++) {
            if (numbers3[i] < smallest3) {
                smallest3 = numbers3[i];
            }
        }

        System.out.println("Question 3 - Smallest value: " + smallest3);

        // Question 4: Index of largest value
        int[] numbers4 = {4, 7, 2, 9, 5};
        int largestIndex4 = 0;

        for (int i = 1; i < numbers4.length; i++) {
            if (numbers4[i] > numbers4[largestIndex4]) {
                largestIndex4 = i;
            }
        }

        System.out.println("Question 4 - Index of largest value: " + largestIndex4);

        // Question 5: Largest/smallest values and indexes
        int[] numbers5 = {12, 5, 18, 3, 10};
        int largest5 = numbers5[0];
        int smallest5 = numbers5[0];
        int largestIndex5 = 0;
        int smallestIndex5 = 0;

        for (int i = 1; i < numbers5.length; i++) {
            if (numbers5[i] > largest5) {
                largest5 = numbers5[i];
                largestIndex5 = i;
            }

            if (numbers5[i] < smallest5) {
                smallest5 = numbers5[i];
                smallestIndex5 = i;
            }
        }

        System.out.println("Question 5 - Largest value: " + largest5);
        System.out.println("Question 5 - Largest index: " + largestIndex5);
        System.out.println("Question 5 - Smallest value: " + smallest5);
        System.out.println("Question 5 - Smallest index: " + smallestIndex5);

        // Day 3 Challenge
        int[] challengeNumbers = {21, 4, 17, 2, 30, 8};
        int challengeLargest = challengeNumbers[0];
        int challengeSmallest = challengeNumbers[0];
        int challengeLargestIndex = 0;
        int challengeSmallestIndex = 0;

        for (int i = 1; i < challengeNumbers.length; i++) {
            if (challengeNumbers[i] > challengeLargest) {
                challengeLargest = challengeNumbers[i];
                challengeLargestIndex = i;
            }

            if (challengeNumbers[i] < challengeSmallest) {
                challengeSmallest = challengeNumbers[i];
                challengeSmallestIndex = i;
            }
        }

        System.out.println("Challenge - Largest value: " + challengeLargest);
        System.out.println("Challenge - Largest index: " + challengeLargestIndex);
        System.out.println("Challenge - Smallest value: " + challengeSmallest);
        System.out.println("Challenge - Smallest index: " + challengeSmallestIndex);
    }
}
