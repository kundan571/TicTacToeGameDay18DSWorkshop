package com.tictactoegame;

import java.util.Scanner;

public class HumanPlayer extends Player {


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
 //       TicTacToe ticTacToe = new TicTacToe();
        TicTacToe.placeMark( row, column, mark);
    }


}
