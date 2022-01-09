package com.neutrinosys.java.foundations.solutions.section4_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {
        String address = "12345 Funny St., Big City, NY 90210";
        String regex = "(?<streetNum>\\d+)\\s+(?<streetName>.*?),\\s*(?<city>.*?),\\s*(?<state>[A-Z]{2})\\s*(?<postCode>\\d{5})";
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(address);
        matcher.find();
        System.out.println(matcher.group("streetNum"));
        System.out.println(matcher.group("streetName"));
        System.out.println(matcher.group("city"));
        System.out.println(matcher.group("state"));
        System.out.println(matcher.group("postCode"));
    }
}
