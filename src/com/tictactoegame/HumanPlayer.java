package com.tictactoegame;

import java.util.Scanner;

public class HumanPlayer {
    String name;
    char mark;

    public HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove() {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        do {
            System.out.println("Enter position where you want to place a mark:!!");
            row = scanner.nextInt();
            column = scanner.nextInt();
            break;
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
