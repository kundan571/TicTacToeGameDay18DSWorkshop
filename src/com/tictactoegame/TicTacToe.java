package com.tictactoegame;

public class TicTacToe {

    char[][] board;

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

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game:!!");
        TicTacToe tacToe = new TicTacToe();
        tacToe.displayBoard();
    }
}