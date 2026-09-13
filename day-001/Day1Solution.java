public class Day1Solution {

    public static void main(String[] args) {

        // Day 1.1: Read values from an array
        int[] numbers = {4, 7, 2, 9, 5};

        System.out.println("First value: " + numbers[0]);
        System.out.println("Value at index 3: " + numbers[3]);
        System.out.println("Total values: " + numbers.length);

        // Day 1.2: Print every value
        System.out.println("\nAll values:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Day 1.3: Print numbers smaller than 5
        System.out.println("\nNumbers smaller than 5:");
        for (int number : numbers) {
            if (number < 5) {
                System.out.println(number);
            }
        }

        // Day 1.4: Count numbers greater than 5
        int greaterThanFive = 0;

        for (int number : numbers) {
            if (number > 5) {
                greaterThanFive++;
            }
        }

        System.out.println("\nCount greater than 5: " + greaterThanFive);

        // Day 1.5: Count numbers smaller than 5
        int smallerThanFive = 0;

        for (int number : numbers) {
            if (number < 5) {
                smallerThanFive++;
            }
        }

        System.out.println("Count smaller than 5: " + smallerThanFive);

        // Day 1.6: Search for a target value
        int target = 9;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        System.out.println("Target 9 found: " + found);

        // Day 1.7: Challenge
        int[] challengeNumbers = {8, 3, 11, 4, 7};
        int countGreaterThanSix = 0;

        for (int number : challengeNumbers) {
            if (number > 6) {
                countGreaterThanSix++;
            }
        }

        System.out.println("Challenge answer: " + countGreaterThanSix);
    }
}
