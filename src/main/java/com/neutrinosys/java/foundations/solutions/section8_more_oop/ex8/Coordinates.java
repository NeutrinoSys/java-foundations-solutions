package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(String chessCoords) {
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
}
