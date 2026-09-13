public class Day2Solution {

    public static void main(String[] args) {

        // Question 1: Print every index
        int[] numbers = {4, 7, 2, 9, 5};

        System.out.println("Question 1 - Indexes:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }

        // Question 2:
        // i represents the current index (position) in the array.

        // Question 3: Print index and value
        System.out.println("\nQuestion 3 - Index and value:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " -> " + numbers[i]);
        }

        // Question 4: Find the index of target 9
        int target = 9;
        int targetIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                targetIndex = i;
                break;
            }
        }

        System.out.println("\nQuestion 4 - Index of 9: " + targetIndex);

        // Question 5: Missing target 100
        target = 100;
        targetIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                targetIndex = i;
                break;
            }
        }

        System.out.println("Question 5 - Index of 100: " + targetIndex);

        // Questions 6 and 7:
        // break stops the loop immediately after the target is found.

        // Question 8: Day 2 Challenge
        int[] challengeNumbers = {8, 3, 11, 4, 7};
        int challengeTarget = 11;
        int challengeTargetIndex = -1;

        for (int i = 0; i < challengeNumbers.length; i++) {
            if (challengeNumbers[i] == challengeTarget) {
                challengeTargetIndex = i;
                break;
            }
        }

        System.out.println("Question 8 - Index of 11: " + challengeTargetIndex);
    }
}
