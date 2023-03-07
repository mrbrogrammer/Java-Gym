package en.codegym.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Favorite board games
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Battleship";
        collection[0] = chess;

        //write your code here
        
        BoardGame sudoku = new BoardGame();
        sudoku.name = "Sudoku";
        BoardGame ticTacTu = new BoardGame();
        ticTacTu.name = "tic tac tu";
        BoardGame monopoly = new BoardGame();
        monopoly.name = "monopoly";
        BoardGame jumanji = new BoardGame();
        jumanji.name = "jumanji";
        
        collection[1] = sudoku;
        collection[2] = ticTacTu;
        collection[3] = monopoly;
        collection[4] = jumanji;
        
        System.out.println(Arrays.toString(collection));
    }
}