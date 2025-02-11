package com.singleton;

public class SingleTonMain {
    public static void main(String[] args) {
        Board board = Board.getInstance();
        Board board1 = Board.getInstance();
        Board board2 = Board.getInstance();
        if(board1==board1 && board2==board1){
            System.out.println("SingleTon Implemented");
        }
        else {
            System.out.println("No Singleton Implemented");
        }
    }
}
