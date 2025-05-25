import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Minesweeper!");
        Scanner scanner = new Scanner(System.in);
        Board gameBoard = new Board();
        boolean gameOver = false;

        while (!gameOver) {
            gameBoard.displayBoard();
            System.out.print("Enter row (0-9): ");
            int row = -1;
            if (scanner.hasNextInt()) {
                row = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            System.out.print("Enter column (0-9): ");
            int col = -1;
            if (scanner.hasNextInt()) {
                col = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            gameOver = gameBoard.revealCell(row, col);

            if (gameOver && gameBoard.isMineHit()) {
                System.out.println("BOOM! You hit a mine!");
                gameBoard.displayBoard();
            } else if (!gameOver) {
                if (gameBoard.checkWinCondition()) {
                    System.out.println("Congratulations! You found all non-mined cells! You WIN!");
                    gameBoard.displayBoard();
                    gameOver = true;
                }
            }
        }

        System.out.println("Game Over.");
        scanner.close();
    }
}