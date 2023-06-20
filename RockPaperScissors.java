import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");

        while (true) {
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer chooses: " + computerChoice);

            int result = determineWinner(playerChoice, computerChoice);
            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1) {
                System.out.println("Congratulations! You win!");
            } else {
                System.out.println("Sorry, you lose. Try again!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }
        }

        scanner.close();
    }

    private static int determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return 0; // Tie
        } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            return 1; // Player wins
        } else {
            return -1; // Computer wins
        }
    }
}
