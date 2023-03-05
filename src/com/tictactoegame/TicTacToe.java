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

    int toss(){
        return  (int)(Math.random() * 2);
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
        Computer computer = new Computer("AIPlayer",'O');
        tacToe.toss();
        if (tacToe.toss() == 1){
            System.out.println("you won the toss: your turn");
            humanPlayer1.makeMove();
            tacToe.displayBoard();
        }else {
            System.out.println("computer move");
            computer.makeMove();
            tacToe.displayBoard();
        }


    }
}