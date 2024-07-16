
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        // Set the range for the random number
        int lowerBound = 1;
        int upperBound = 100;

        // Generate a random number
        Random random = new Random();
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the number guessing game! Guess the number between " + lowerBound + " and " + upperBound + ".");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            try {
                guess = Integer.parseInt(scanner.nextLine());
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number " + numberToGuess + " in " + attempts + " attempts.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}