package com.neutrinosys.java.foundations.solutions.section6_control_flow;

public class Exercise6 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : days) {
            String meal = switch (day) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                default -> "pizza";
            };
            System.out.printf("We eat %s on %s%n", meal, day);
//            System.out.printf("We eat %s on %s%n", capitalize(meal), day); // 6.1 solution
//            System.out.printf("We eat %s on %s%n", capitalizeMultiWord(meal), day); // 6.2 solution
        }
    }

    public static String capitalize(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public static String capitalizeMultiWord(String meal) {
        String[] words = meal.split(" ");

        // I am initializing the StringBuilder because I am able to determine the exact needed size from the incoming
        // 'meal' variable. I am adding '+1' because after capitalizing each word in the meal, I will automatically
        // add a space. In case of "pot roast", which is 9 characters long, if I add space to each word, it would be
        // "pot " & "roast ", which is 10 characters, so, meal.length() + 1.
        // If I do not add space at end of each word, I will return "PotRoast", incorrectly.
        // Notice how I reuse the capitalize() method even here. Always good to be able to build on top of existing
        // functionality.
        StringBuilder sb = new StringBuilder(meal.length() + 1);
        for (String word : words) {
            sb.append(capitalize(word)).append(" ");
        }
        // Since I am automatically adding space to the end of each word, I must strip() trailing space,
        // otherwise, I'd return "Pot Roast " instead of "Pot Roast".
        return sb.toString().strip();
    }
}
