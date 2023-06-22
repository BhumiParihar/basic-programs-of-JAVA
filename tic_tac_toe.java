import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private boolean gameOver;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameOver = false;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    private boolean checkForWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][0] == board[i][2])
                return true;
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[0][j] == board[2][j])
                return true;
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[0][0] == board[2][2])
            return true;

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[0][2] == board[2][0])
            return true;

        return false;
    }

    private void makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        } else {
            System.out.println("Invalid move. Please try again.");
        }
    }

    private void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Tic Tac Toe!");

        while (!gameOver) {
            printBoard();

            if (currentPlayer == 'X') {
                System.out.print("Player X, enter your move (row [0-2] and column [0-2]): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                makeMove(row, col);
            } else {
                // Computer's turn
                System.out.println("Player O (Computer's turn):");
                makeComputerMove();
            }

            if (checkForWin()) {
                System.out.println("Game over! Player " + currentPlayer + " wins!");
                gameOver = true;
            } else if (isBoardFull()) {
                System.out.println("Game over! It's a tie!");
                gameOver = true;
            }
            System.out.println();
        }

        scanner.close();
    }

    private void makeComputerMove() {
        Random random = new Random();

        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (board[row][col] != '-');

        makeMove(row, col);
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
