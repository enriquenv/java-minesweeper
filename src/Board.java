import java.util.Random;

public class Board {

    private char[][] grid;
    private int size = 10;
    private boolean[][] minesGrid;
    private int numberOfMines = 10;
    private boolean mineWasHit = false;

    public Board() {
        grid = new char[size][size];
        minesGrid = new boolean[size][size];
        initializeBoard();
        placeMines();
        System.out.println("Board initialized and mines hidden");
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '?';
                minesGrid[i][j] = false;
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < numberOfMines) {
            int row = random.nextInt(size);
            int col = random.nextInt(size);

            if (!minesGrid[row][col]) {
                minesGrid[row][col] = true;
                minesPlaced++;
            }
        }
        /*
         * System.out.println("MinesGrid");
         * for (int i = 0; i < size; i++) {
         * for (int j = 0; j < size; j++) {
         * System.out.print(minesGrid[i][j] ? "M " : ". ");
         * }
         * System.out.println();
         * }
         */
    }

    public boolean revealCell(int row, int col) {
        mineWasHit = false;

        if (row < 0 || row >= size || col < 0 || col >= size) {
            System.out.println("Invalid coordinates. Try again.");
            return false;
        }

        if (grid[row][col] != '?') {
            System.out.println("Cell already revealed. Try again.");
            return false;
        }

        if (minesGrid[row][col]) {
            grid[row][col] = 'X';
            mineWasHit = true;
            // Game over
            return true;
        } else {
            grid[row][col] = '0';
            // Game continues
            return false;
        }
    }

    public boolean isMineHit() {
        return mineWasHit;
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