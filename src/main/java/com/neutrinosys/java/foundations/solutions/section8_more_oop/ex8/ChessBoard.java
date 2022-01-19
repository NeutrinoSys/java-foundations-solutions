package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

public class ChessBoard {
    private ChessPiece[][] internalBoard = new ChessPiece[8][8];

    public void add(ChessPiece piece, String chessCoords) {
        Coordinates coords = new Coordinates(chessCoords);
        piece.setCoordinates(coords);
        internalBoard[coords.getX()][coords.getY()] = piece;
    }

    public ChessPiece getPieceAtCoords(String chessCoords) {
        Coordinates coords = new Coordinates(chessCoords);
        return internalBoard[coords.getX()][coords.getY()];
    }
}
