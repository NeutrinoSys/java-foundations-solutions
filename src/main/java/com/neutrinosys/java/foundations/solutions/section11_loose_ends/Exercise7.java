package com.neutrinosys.java.foundations.solutions.section11_loose_ends;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ISO_INSTANT;
import static java.time.format.DateTimeFormatter.ofPattern;

public class Exercise7 {
    public static void main(String[] args) throws IOException {
        // Sample date/time 1
        // The format of the input String matches the pattern of
        // DateTimeFormatter.ISO_INSTANT (look at the Javadoc for DateTimeFormatter)
        // This formatter wants to parse its Strings into an Instant object
        // So, you see me using Instant.from() to receive the output from parse()
        System.out.println(Instant.from(ISO_INSTANT.parse("2022-02-09T05:02:01Z")));

        // Sample date/time 2
        // Didn't see a ready-made format for this String as with the previous one, so
        // chose to use ofPattern() & specify manually. The single tick ' symbol is
        // used to indicate the pattern should expect a literal "T" at that position
        // You could find that out by looking at the Javadoc for DateTimeFormatter in detail
        // (you may need to read it thoroughly to find that out)
        // Note, I'm able to use ZonedDateTime.from() here, though Instant.from() also would work
        System.out.println(ZonedDateTime.from(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'kk:mm:ssxx").parse("2022-02-09T05:02:01+0000")));

        // Sample date/time 3
        System.out.println(ZonedDateTime.from(DateTimeFormatter.ofPattern("E, dd MMM yyyy kk:mm:ss xx").parse("Wed, 09 Feb 2022 05:02:01 +0000")));

        // Sample date/time 4
        // Notice I use ZonedDateTime.parse() taking the String to parse and a DateTimeFormatter
        // This is no different from the previous approach - just another way of doing it so you can see alternatives.
        // It is about 3 characters shorter I suppose.
        System.out.println(ZonedDateTime.parse("Wednesday, 09-Feb-22 05:02:01 UTC", DateTimeFormatter.ofPattern("EEEE, dd-MMM-yy kk:mm:ss z")));


        // Sample date/time 5
        // Here, I chose to use ofPattern() as a static import to shorten the line further
        System.out.println(ZonedDateTime.parse("Wed, 09 Feb 22 05:02:01 +0000", ofPattern("E, dd MMM yy kk:mm:ss xx")));


        // Sample date/time 13
        // The key to this one is recognizing that 1644382921 is an epoch time. I understood this
        // because this whole exercise is about dealing with & converting times, and any example
        // nothing but a long number is almost certainly going to be an epoch time.
        // You learned that Unix/epoch times are represented by the Instant class, so it would
        // follow that there should be a way to create an Instant from just the epoch number
        // That turns out to be done with the ofEpochSecond() method. I then proceed
        // to convert the Instant to a ZonedDateTime object by calling Instant.atZone()
        // and specify I want the newly-created ZonedDateTime to be at time zone +0
        // somewhat arbitrarily
        System.out.println(Instant.ofEpochSecond(1644382921).atZone(ZoneId.of("+0")));

    }
}
