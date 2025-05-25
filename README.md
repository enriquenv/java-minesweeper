# Minesweeper Game

This is a terminal-based Minesweeper game implemented in Java. The goal is to clear the board by revealing all non-mine cells.

## Features

- A 10x10 grid.
- 10 mines randomly placed at the start of each game.
- Choosing a non-mine cell reveals the number of adjacent cells with mines.
- The game ends with a "BOOM!" if a mine is revealed.
- The player wins if all non-mine cells are successfully revealed.

## How to Compile and Run

You must have Java Development Kit (JDK) installed on your system.

1.  Navigate to the `src` directory in your terminal.
2.  Compile the Java files:
    ```bash
    javac App.java Board.java
    ```
3.  Run the game:
    ```bash
    java App
    ```
