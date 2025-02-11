package com.singleton;

public class Board {

    private static Board board;
    private Board() {

    }

    public static Board getInstance(){
        if(board==null){
            board = new Board();
            return board;
        }
        else {
            return board;
        }
    }
}
