package com.neutrinosys.java.foundations.solutions.section7_testing;

public class Exercise3 {

    private static final String[] clusters = new String[]{"tr", "fl", "pl", "sn", "bl", "cr"};

    public static String spoonerize(String phrase) {
        String[] words = phrase.split("\\s+"); // split 'flat cap' into array {"flat", "cap"}
        String firstWord = words[0]; // store first word of array, "flat", into firstWord variable
        String firstWordPrefix = findPrefix(firstWord); // determine beginning letter or cluster of "flat", which is "fl"

        // remove "fl" from "flat", leaving "at"
        // do this by getting length of prefix "fl", which is 2
        // then, get substring of "flat", starting at index 2 (the length of "fl")
        // indexes of "flat" are: f=0, l=1, a=2, t=3
        // so index 2 of "flat" is "a"
        // substring() method with only one parameter (index), returns all letters
        // starting at that index until the end of String,
        // which would be: a=2, t=3 -> "at"
        String firstWordStripped = firstWord.substring(firstWordPrefix.length());
        String secondWord = words[1]; // repeat for second word (arrays are zero-based, so words[1] is second word - "cap"
        String secondWordPrefix = findPrefix(secondWord); // returns just "c" since "cap" doesn't start with a known cluster
        String secondWordStripped = secondWord.substring(secondWordPrefix.length()); // returns "ap"
        StringBuilder sb = new StringBuilder() // going to build a new phrase
                .append(secondWordPrefix) // "c"
                .append(firstWordStripped) // "c" + "at" = "cat"
                .append(" ") // "cat" + " " (space) = "cat "
                .append(firstWordPrefix) // "cat " + "fl" = "cat fl"
                .append(secondWordStripped); // "cat fl" + "ap" = "cat flap"
        return sb.toString(); // "cat flap"
    }

    /**
     * If the word begins with a known English word cluster, such as:
     * 'tr', 'fl', 'pl', 'sn', etc.
     * this method will determine that and return that matching prefix.
     * Otherwise, it will simply return the first letter of the word.
     * It finds the cluster by iterating over the class's internal array
     * of known clusters, one at a time, testing if the word "startsWith()"
     * that cluster and returning it if it does. This means this program
     * can only 'spoonerize' words with clusters it knows about.
     * @param word
     * @return
     */
    private static String findPrefix(String word) {
        for (String cluster : clusters) { // iterate over each cluster in clusters array "tr", "fl", "pl", "sn" - one at a time
            if (word.startsWith(cluster)) { // does "flat" start with "tr"? no? does "flat" start with "fl"?, yes? then return "fl"
                return cluster;
            }
        }
        // to get down this far, it means our word doesn't start with any known cluster, so for example, let's assume
        // the word is "cat"...
        // if "cat" doesn't start with any clusters, then just return the first letter of "cat", "c"
        return word.substring(0, 1);
    }
}
