package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

import org.junit.jupiter.api.Test;

import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.BLACK;
import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.WHITE;
import static org.junit.jupiter.api.Assertions.*;

class KnightTest extends ChessPieceTest {

    @Test
    public void knightCanMoveNorthEast() {
        Knight knight = new Knight(WHITE);
        knight.setCoordinates(new Coordinates("c1"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("d3");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void knightCanMoveNorthWest() {
        Knight knight = new Knight(WHITE);
        knight.setCoordinates(new Coordinates("c1"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("b3");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void knightCanMoveEastNorth() {
        Knight knight = new Knight(WHITE);
        knight.setCoordinates(new Coordinates("c1"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("e2");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void knightCanMoveEastSouth() {
        Knight knight = new Knight(WHITE);
        knight.setCoordinates(new Coordinates("c3"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("e2");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void knightCanMoveWestNorth() {
        Knight knight = new Knight(WHITE);
        knight.setCoordinates(new Coordinates("c3"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a4");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void knightCanMoveWestSouth() {
        Knight knight = new Knight(WHITE);
        knight.setCoordinates(new Coordinates("c3"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a2");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void knightCanMoveSouthEast() {
        Knight knight = new Knight(WHITE);
        knight.setCoordinates(new Coordinates("c3"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("d1");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void knightCanMoveSouthWest() {
        Knight knight = new Knight(WHITE);
        knight.setCoordinates(new Coordinates("c3"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("b1");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

    @Test
    public void blackKnightCanMoveSouthWest() {
        Knight knight = new Knight(BLACK);
        knight.setCoordinates(new Coordinates("d5"));
        Coordinates[] validMoves = knight.getValidMoves();
        Coordinates expectedDestination = new Coordinates("c7");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
    }

}