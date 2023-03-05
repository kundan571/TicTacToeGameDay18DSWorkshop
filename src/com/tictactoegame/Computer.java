package com.tictactoegame;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String name;
    char mark;

    public Computer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        do {
            Random random = new Random();
            row = random.nextInt(3);
            column = random.nextInt(3);
        } while (!isValidMove(row, column));
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.placeMark( row, column, mark);
    }

    boolean isValidMove(int row, int column) {
        if (row >= 0 && row <= 3 && column >= 0 && column <= 3) {
            if (TicTacToe.board[row][column] == ' ') {
                return true;
            }
        }
        return false;
    }
}
