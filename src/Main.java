
import java.util.Random;

class Main {
    public static void main(String[] args) {
        // Test the functions
        String numString = "1 2 3 4 5 6 7 8 9 10";
        int target = 80;
        int maxDonations = 15;
        String phrase = "This is the first sentence. This is the second sentence. This is the third sentence.";

        System.out.println("Sum of integers: " + sumOfIntegers(numString));
        System.out.println("Number of odd elements: " + numberOfOddElements(numString));
        System.out.println("Numbers greater than 5: " + numbersGreaterThan(numString, 5));
        System.out.println("Success message: " + reachDonationTarget(target, maxDonations));
        System.out.println("Success message with max donations: " + reachDonationTargetWithMax(target, maxDonations));
        printSentences(phrase);
    }

    // Function 1
    public static int sumOfIntegers(String numString) {
        String[] nums = numString.split(" ");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    // Function 2
    public static int numberOfOddElements(String numString) {
        String[] nums = numString.split(" ");
        int oddCount = 0;
        for (String num : nums) {
            if (Integer.parseInt(num) % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    // Function 3
    public static String numbersGreaterThan(String numString, int threshold) {
        String[] nums = numString.split(" ");
        String result = "";
        for (String num : nums) {
            if (Integer.parseInt(num) > threshold) {
                result += num + " ";
            }
        }
        return result;
    }

    // Function 4
    public static String reachDonationTarget(int target, int maxDonations) {
        Random rand = new Random();
        int currentAmount = 0;
        int donations = 0;

        while (currentAmount < target) {
            int donation = rand.nextInt(50);
            currentAmount += donation;
            donations++;
        }
        return "Target reached after " + donations + " donations!";
    }

    // Function 5
    public static String reachDonationTargetWithMax(int target, int maxDonations) {
        Random rand = new Random();
        int currentAmount = 0;
        int donations = 0;

        while (currentAmount < target && donations < maxDonations) {
            int donation = rand.nextInt(100);
            currentAmount += donation;
            donations++;
        }
        if (currentAmount >= target) {
            return "Target reached after " + donations + " donations!";
        } else {
            return "Failed to reach target after " + maxDonations + " donations.";
        }
    }

    // Function 6
    public static void printSentences(String phrase) {
        String[] sentences = phrase.split("\\.");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

}
