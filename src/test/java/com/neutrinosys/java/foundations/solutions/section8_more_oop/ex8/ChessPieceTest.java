package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

public class ChessPieceTest {
    protected boolean isMoveFoundInArray(Coordinates[] moves, Coordinates expectedMove) {
        for (int x=0; x < moves.length; x++) {
            if (moves[x].equals(expectedMove)) return true;
        }
        return false;
    }
}
