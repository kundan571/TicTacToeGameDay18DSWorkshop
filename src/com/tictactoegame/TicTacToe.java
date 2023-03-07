package com.tictactoegame;

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

    int toss() {
        return (int) (Math.random() * 2);
    }

    static void placeMark(int row, int column, char mark) {
        if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
            if (TicTacToe.board[row][column] == ' ')
                board[row][column] = mark;
        } else {
            System.out.println("Invalid position input!!");
        }
    }

    boolean checkColumnWin() {
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    boolean checkRowWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    boolean checkDiagWin() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
                || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game:!!");
        TicTacToe tacToe = new TicTacToe();

        HumanPlayer humanPlayer1 = new HumanPlayer("kundan", 'X');
        Computer computer = new Computer("AIPlayer", 'O');

        Player cp;
        if (tacToe.toss() == 1) {
            cp = humanPlayer1;
        } else {
            cp = computer;
        }

        while (true) {
            System.out.println(cp.name + " Turn");
            cp.makeMove();
            tacToe.displayBoard();
            if (tacToe.checkRowWin() || tacToe.checkColumnWin() || tacToe.checkDiagWin()) {
                System.out.println(cp.name + " Has won!!");
                break;
            } else {
                if (cp == humanPlayer1) {
                    cp = computer;
                } else {
                    cp = humanPlayer1;
                }
            }
        }
    }
}