package com.neutrinosys.java.foundations.solutions.section8_more_oop.ex8;

public class ChessPiece {
    protected Coordinates coordinates;
    protected Color color;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    enum Color {
        BLACK,
        WHITE;
    }
}
