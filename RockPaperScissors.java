
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class RockPaperScissors {

    public static void main(String[] args) {
        int userScore = 0;
        int computerScore = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock Paper Scissors!");
        System.out.println("------------*********-------------");

        while (true) {
            // Get user's choice
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {

                // Generate computer's choice
                String[] options = { "rock", "paper", "scissors" };
                int index = random.nextInt(options.length);
                String computerChoice = options[index];

                System.out.println("-------------------------");

                System.out.println("Computer chose " + computerChoice + ".");

                // Compare user's choice with computer's choice
                if (userChoice.equals(computerChoice)) {
                    System.out.println("-------------------------");
                    System.out.println("It's a tie!");
                    System.out.println("-------------------------");
                } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("paper") && computerChoice.equals("rock") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper")) {
                    System.out.println("-------------------------");        
                    System.out.println("You win!");
                    System.out.println("-------------------------");
                    userScore++;
                } else {
                    System.out.println("-------------------------");
                    System.out.println("Computer wins!");
                    System.out.println("-------------------------");
                    computerScore++;
                }

                // Show current score
                System.out.println("Current score: You - [" + userScore + "], Computer - [" + computerScore +"]");

                // Ask if user wants to play again
                System.out.print("Do you want to play again? (yes or no): ");
                String playAgain = scanner.nextLine().toLowerCase();
                if (!playAgain.equals("yes")) {
                    break;
                }
            }
            else{
                System.out.println("Please Cheak your Input");
            }
        }
        // Show final score
        System.out.println("Final score: You - " + userScore + ", Computer - " + computerScore);
    }
}
