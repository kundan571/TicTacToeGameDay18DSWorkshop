package com.tictactoegame;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {


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
   //     TicTacToe ticTacToe = new TicTacToe();
            TicTacToe.placeMark( row, column, mark);
    }


}
