package com.tictactoegame;

import java.util.Scanner;

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
    void placeMark(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row and columnth position where you want to place a mark:!!");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        System.out.println("Choose a letter X Or O to place a mark");
        char mark = scanner.next().charAt(0);
        board[row][column] = mark;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game:!!");
        TicTacToe tacToe = new TicTacToe();
        tacToe.displayBoard();
        tacToe.placeMark();
        tacToe.displayBoard();
    }
}