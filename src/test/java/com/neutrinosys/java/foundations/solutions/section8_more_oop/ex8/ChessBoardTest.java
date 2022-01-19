package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

import org.junit.jupiter.api.Test;

import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.BLACK;
import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.WHITE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ChessBoardTest {

    @Test
    public void canAddPawn() {
        ChessBoard board = new ChessBoard();
        Pawn pawn = new Pawn(WHITE);
        board.add(pawn, "a2");
        Pawn foundPawn = (Pawn) board.getPieceAtCoords("a2");
        assertEquals(pawn, foundPawn);
    }

    @Test
    public void canAddKnight() {
        ChessBoard board = new ChessBoard();
        Knight knight = new Knight(BLACK);
        board.add(knight, "c1");
        Knight foundKnight = (Knight) board.getPieceAtCoords("c1");
        assertEquals(knight, foundKnight);
    }

}