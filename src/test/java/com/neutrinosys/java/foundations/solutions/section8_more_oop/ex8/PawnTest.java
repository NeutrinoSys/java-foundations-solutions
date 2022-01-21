package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

import org.junit.jupiter.api.Test;

import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.BLACK;
import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.WHITE;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PawnTest extends ChessPieceTest {

    @Test
    public void pawnCanMoveOneForward() {
        Pawn pawn = new Pawn(WHITE);
        pawn.setCoordinates(new Coordinates("a2"));
        Coordinates[] validMoves = pawn.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a3");
//        assertEquals(expectedDestination, validMoves[0]);
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination), String.format("Move '%s' not found.", expectedDestination));
    }

    @Test
    public void pawnCanMoveTwoForwardOnFirstMove() {
        Pawn pawn = new Pawn(WHITE);
        pawn.setCoordinates(new Coordinates("a2"));
        Coordinates[] validMoves = pawn.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a4");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void canNotMoveTwoAfterFirstMove() {
        Pawn pawn = new Pawn(WHITE);
        pawn.setCoordinates(new Coordinates("a2"));
        pawn.setCoordinates(new Coordinates("a3"));
        Coordinates[] validMoves = pawn.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a5");
        assertFalse(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void canMoveOneDiagonallyRight() {
        Pawn pawn = new Pawn(WHITE);
        pawn.setCoordinates(new Coordinates("a2"));
        Coordinates[] validMoves = pawn.getValidMoves();
        assertTrue(isMoveFoundInArray(validMoves, new Coordinates("b3")));
    }

    @Test
    public void canMoveOneDiagonallyLeft() {
        Pawn pawn = new Pawn(WHITE);
        pawn.setCoordinates(new Coordinates("b2"));
        Coordinates[] validMoves = pawn.getValidMoves();
        assertTrue(isMoveFoundInArray(validMoves, new Coordinates("a3")));
    }

    @Test
    public void blackPawnCanMoveOneForward() {
        Pawn pawn = new Pawn(BLACK);
        pawn.setCoordinates(new Coordinates("a7"));
        Coordinates[] validMoves = pawn.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a6");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void blackPawnCanMoveTwoForwardOnFirstMove() {
        Pawn pawn = new Pawn(BLACK);
        pawn.setCoordinates(new Coordinates("b7"));
        Coordinates[] validMoves = pawn.getValidMoves();
        Coordinates expectedDestination = new Coordinates("b5");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }


}