import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int GuessNumber = random.nextInt(100) + 1;
            int Attempts = 0;
            int MaxAttempts = 5;

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");

            while (Attempts < MaxAttempts) {
                System.out.print("Enter your guess: ");
                int User_Guess = scanner.nextInt();
                scanner.nextLine();

                Attempts++;

                if (User_Guess == GuessNumber) {
                    System.out.println("Congratulations! You guessed the number " + GuessNumber + " in " + Attempts + " Attempts.");
                    score++;
                    break;
                } else if (User_Guess < GuessNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (Attempts >= MaxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + GuessNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + score);

        scanner.close();
    }
}