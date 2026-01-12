import java.util.Scanner;

public class GuessingNumberGame {
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());
        
        int attempts = 0; 
        
        int K = 5; 
        boolean guessedCorrectly = false;

        System.out.println(
            "A number is chosen between 1 and 100.");
        System.out.println(
            "You have " + K
            + " attempts per round to guess the correct number.");

        while (!guessedCorrectly) {
            for (int i = 0; i < K; i++) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++; 

                if (guess == number) {
                    System.out.println(
                        "Congratulations! You guessed the correct number in "
                        + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }
                else if (guess < number) {
                    System.out.println(
                        "The number is greater than "
                        + guess);
                }
                else {
                    System.out.println(
                        "The number is less than " + guess);
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You have used all " + K
                                   + " attempts.");
                System.out.print(
                    "Do you want to continue guessing? (yes/no): ");
                String response = sc.next();

                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println(
                        "Game Over! The correct number was: "
                        + number);
                    break;
                }
            }
        }
        sc.close();
    }
    public static void main(String[] args)
    {
        guessingNumberGame();
    }
}


// ANSWER
// A number is chosen between 1 and 100.
// You have 5 attempts per round to guess the correct number.
// Enter your guess: 20
// The number is greater than 20
// Enter your guess: 50
// The number is less than 50
// Enter your guess: 40
// The number is greater than 40
// Enter your guess: 45
// The number is greater than 45
// Enter your guess: 46
// The number is greater than 46
// You have used all 5 attempts.
// Do you want to continue guessing? (yes/no): yes
// Enter your guess: 47
// The number is greater than 47
// Enter your guess: 48
// Congratulations! You guessed the correct number in 7 attempts.