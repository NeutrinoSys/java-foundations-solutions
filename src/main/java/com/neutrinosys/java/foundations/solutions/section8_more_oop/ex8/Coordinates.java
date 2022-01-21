package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

import java.util.Objects;

public class Coordinates {
    private final int x;
    private final int y;
    private String chessCoords;

    public Coordinates(String chessCoords) {
        this.chessCoords = chessCoords;
        char file = chessCoords.charAt(0);
        int rank = Integer.parseInt(Character.toString(chessCoords.charAt(1)));
        x = getXForFile(file);
        y = getYForRank(rank);
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates getOffset(int x, int y) {
        return new Coordinates(this.x + x, this.y + y);
    }

    private String getArrayCoords(String chessCoords) {
        char file = chessCoords.charAt(0);
        int rank = Integer.parseInt(Character.toString(chessCoords.charAt(1)));
        int x = getXForFile(file);
        int y = getYForRank(rank);
        return String.format("%d, %d", x, y);
    }

    public boolean isPermittedMove(Coordinates[] moves) {
        for (int x=0; x < moves.length; x++) {
            if (moves[x].equals(this)) return true;
        }
        return false;
    }

    private int getXForFile(char file) {
        return file - 97;
    }

    private int getYForRank(int rank) {
        return 8 - rank;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("%s -> (%d, %d)", chessCoords, x, y);
    }
}
