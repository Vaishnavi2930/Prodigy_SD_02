package Prodigy_SD_02;


import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Seed the random number generator with the current time
        long seed = System.currentTimeMillis();
        java.util.Random random = new java.util.Random(seed);

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        int guess;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}
