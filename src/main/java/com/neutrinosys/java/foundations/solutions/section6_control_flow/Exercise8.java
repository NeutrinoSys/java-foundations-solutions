package com.neutrinosys.java.foundations.solutions.section6_control_flow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise8 {
    public static void main(String[] args) {
        String addresses = """
                12345 First Street, First City, AA 90210
                22222 Second Street, Second City, BB 22222
                33333 Third Street, Third City, CC 33333
                44444 Fourth Street, Fourth City, DD 44444
                55555 Fifth Street, Fifth City, EE 55555
                66666 Sixth Street, Sixth City, FF 66666
                77777 Seventh Street, Seventh City, GG 77777
                88888 Eighth Street, Eighth City, HH 88888
                99999 Ninth Street, Ninth City, II 99999
                00000 Tenth Street, Tenth City, JJ 00000
                """;
        Pattern pat = Pattern.compile("""
        (?<street>.*?),\\s+(?<city>.*?),\\s+(?<state>[A-Z]{2})\\s+(?<zip>\\d{5})$
        """, Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher mat = pat.matcher(addresses);
        while(mat.find()) {
            System.out.println(mat.group("street"));
            System.out.println(mat.group("city"));
            System.out.println(mat.group("state"));
            System.out.println(mat.group("zip"));
            System.out.println("--------------------------------------");
        }
    }
}
