package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

import org.junit.jupiter.api.Test;

import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.BLACK;
import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.WHITE;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void canMoveC1KnightToD3() {
        ChessBoard board = new ChessBoard();
        Knight knight = new Knight(WHITE);
        board.add(knight, "c1");
        assertEquals(knight, board.getPieceAtCoords("c1"), "Knight should initially be @ c1");

        board.move(knight, "d3");

        assertNull(board.getPieceAtCoords("c1"), "After move, Knight should no longer be @ c1");
        assertEquals(knight, board.getPieceAtCoords("d3"), "Knight should now be @ d3");
    }

    @Test()
    public void canNotMoveC1KnightToInvalidSquare() {
        ChessBoard board = new ChessBoard();
        Knight knight = new Knight(WHITE);
        board.add(knight, "c1");
        assertEquals(knight, board.getPieceAtCoords("c1"), "Knight should initially be @ c1");

        board.move(knight, "d4");

        assertNull(board.getPieceAtCoords("d4"), "After move, Knight should not be @ d4");
        assertEquals(knight, board.getPieceAtCoords("c1"), "Knight should still be @ c1");
    }

    @Test
    public void canNotMoveC1KnightToFriendlyOccupiedSquare() {
        ChessBoard board = new ChessBoard();
        Pawn pawn = new Pawn(WHITE);
        board.add(pawn, "d3");
        Knight knight = new Knight(WHITE);
        board.add(knight, "c1");
        assertEquals(knight, board.getPieceAtCoords("c1"), "Knight should initially be @ c1");

        board.move(knight, "d3");

        assertEquals(pawn, board.getPieceAtCoords("d3"), "After move attempt, pawn should still be @ d3");
        assertEquals(knight, board.getPieceAtCoords("c1"), "Knight should still be @ c1");
    }

    @Test
    public void canMoveC1KnightToEnemyOccupiedSquare() {
        ChessBoard board = new ChessBoard();
        Pawn pawn = new Pawn(BLACK);
        board.add(pawn, "d3");
        Knight knight = new Knight(WHITE);
        board.add(knight, "c1");
        assertEquals(knight, board.getPieceAtCoords("c1"), "Knight should initially be @ c1");

        board.move(knight, "d3");

        assertTrue(elementExists(board.getWhiteCapturedPieces(), pawn), "Pawn should now be among white's captured pieces");
        assertEquals(knight, board.getPieceAtCoords("d3"), "Knight should now be @ d3");
    }

    private boolean elementExists(Object[] array, Object element) {
        for (Object object : array) {
            if (object == element) return true;
        }
        return false;
    }

}