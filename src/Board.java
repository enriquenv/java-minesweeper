public class Board {

    private char[][] grid;
    private int size = 10;

    public Board() {
        // System.out.println("Board created");
        grid = new char[size][size];
        initializeBoard();
        System.out.println("Board initialized");
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '?';
            }
        }
    }

    public void displayBoard() {
        // System.out.println("Board displayed");
        System.out.println("\n  Current board:");
        System.out.print("  ");
        for (int j = 0; j < size; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}