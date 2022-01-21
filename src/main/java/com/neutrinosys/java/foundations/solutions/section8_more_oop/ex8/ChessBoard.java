package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

import java.util.Arrays;

import static com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8.ChessPiece.Color.WHITE;

public class ChessBoard {
    private ChessPiece[][] internalBoard = new ChessPiece[8][8];
    private ChessPiece[] whiteCapturedPieces = new ChessPiece[0];
    private ChessPiece[] blackCapturedPieces = new ChessPiece[0];

    public void add(ChessPiece piece, String chessCoords) {
        Coordinates coords = new Coordinates(chessCoords);
        piece.setCoordinates(coords);
        internalBoard[coords.getX()][coords.getY()] = piece;
    }

    public ChessPiece getPieceAtCoords(String chessCoords) {
        Coordinates coords = new Coordinates(chessCoords);
        return internalBoard[coords.getX()][coords.getY()];
    }

    public void move(ChessPiece piece, String destCoords) {
        Coordinates origin = piece.coordinates;
        Coordinates destination = new Coordinates(destCoords);
        if (destinationIsOccupiedByFriendly(piece, destination)) {
            return;
        } else if (destinationIsOccupiedByEnemy(piece, destination)) {
            ChessPiece capturedPiece = getPieceAtCoords(destCoords);
            capturedPiece.setCoordinates(null);
            if (piece.color == WHITE) {
                whiteCapturedPieces = addToCapturedPieces(capturedPiece, whiteCapturedPieces);
            } else {
                blackCapturedPieces = addToCapturedPieces(capturedPiece, blackCapturedPieces);
            }
        }

//        if (existsAmongValidMoves(piece.getValidMoves(), destination)) {
        performActualMove(piece, destCoords, origin, destination);
    }

    private ChessPiece[] addToCapturedPieces(ChessPiece capturedPiece, ChessPiece[] capturedPieces) {
        ChessPiece[] tmpCaptures = Arrays.copyOf(capturedPieces, capturedPieces.length + 1);
        tmpCaptures[capturedPieces.length] = capturedPiece;
        return tmpCaptures;
    }

    private void performActualMove(ChessPiece piece, String destCoords, Coordinates origin, Coordinates destination) {
        if (destination.isPermittedMove(piece.getValidMoves())) {
            internalBoard[origin.getX()][origin.getY()] = null; // remove from original square
            add(piece, destCoords);
        }
    }

    private boolean destinationIsOccupiedByFriendly(ChessPiece piece, Coordinates destination) {
        ChessPiece destinationPiece = internalBoard[destination.getX()][destination.getY()];
        return destinationPiece != null && destinationPiece.color == piece.color;
    }

    private boolean destinationIsOccupiedByEnemy(ChessPiece piece, Coordinates destination) {
        ChessPiece destinationPiece = internalBoard[destination.getX()][destination.getY()];
        return destinationPiece != null && destinationPiece.color != piece.color;
    }

    public ChessPiece[] getWhiteCapturedPieces() {
        return whiteCapturedPieces;
    }
}
