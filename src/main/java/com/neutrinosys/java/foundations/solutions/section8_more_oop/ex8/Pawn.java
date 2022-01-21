package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;


public class Pawn extends ChessPiece {
    private boolean hasMoved = false;

    public Pawn(Color color) {
        super(color);
    }

    public Coordinates[] getValidMoves() {

        int numOfPossibleMoves = hasMoved ? 3 : 4;
        Coordinates[] validMoves = new Coordinates[numOfPossibleMoves];

        Coordinates forwardOne = getCoordinates().getOffset(0, calcYWithDirFactor(-1));
        validMoves[0] = forwardOne;

        Coordinates diagonallyRightOne = getCoordinates().getOffset(1, calcYWithDirFactor(-1));
        validMoves[1] = diagonallyRightOne;

        Coordinates diagonallyLeftOne = getCoordinates().getOffset(-1, calcYWithDirFactor(-1));
        validMoves[2] = diagonallyLeftOne;

        if (!hasMoved) {
            Coordinates forwardTwo = getCoordinates().getOffset(0, calcYWithDirFactor(-2));
            validMoves[3] = forwardTwo;
        }
        return validMoves;
    }

    @Override
    public void setCoordinates(Coordinates coordinates) {
        if (this.coordinates != null) {
            hasMoved = true;
        }
        super.setCoordinates(coordinates);
    }
}
