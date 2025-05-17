public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Minesweeper!");

        Board gameBoard = new Board();

        gameBoard.displayBoard();

        System.out.println("Game was setup.");
    }
}