package com.neutrinosys.java.foundations.solutions.section8_more_oop;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(getArrayCoords("a8"));
        System.out.println(getArrayCoords("h1"));
        System.out.println(getArrayCoords("g5"));
        System.out.println(getArrayCoords("d4"));
    }

    private static String getArrayCoords(String chessCoords) {
        char file = chessCoords.charAt(0);
        int rank = Integer.parseInt(Character.toString(chessCoords.charAt(1)));
        int x = getXForFile(file);
        int y = getYForRank(rank);
        return String.format("%d, %d", x, y);
    }

    private static int getXForFile(char file) {
        return file - 97;
    }

    private static int getYForRank(int rank) {
        return 8 - rank;
    }
}
