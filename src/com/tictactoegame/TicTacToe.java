package com.tictactoegame;

import java.util.Scanner;

public class TicTacToe {

   static char[][] board;

    public TicTacToe() {
        this.board = new char[3][3];
        initialiseBoard();
    }

    void initialiseBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int column, char mark) {
        if (row >= 0 && row <= 3 && column >= 0 && column <= 3) {
            if (board[row][column] == ' ')
                board[row][column] = mark;
            }
         else {
            System.out.println("Invalid position input!!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game:!!");
        TicTacToe tacToe = new TicTacToe();
        tacToe.displayBoard();
        HumanPlayer humanPlayer1 = new HumanPlayer("kundan",'X');
        HumanPlayer humanPlayer2 = new HumanPlayer("Ritik",'O');

        HumanPlayer cp;
        cp = humanPlayer1;

        System.out.println(cp.name + " Turn:");
        cp.makeMove();
        tacToe.displayBoard();
        cp.makeMove();
        tacToe.displayBoard();
    }
}