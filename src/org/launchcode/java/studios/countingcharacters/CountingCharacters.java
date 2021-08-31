package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        // Prompts user for a string input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to count each character: ");

        /* String is then made to lowercase and remove all non-alphabetical characters with regex to complete
           bonus mission objectives. */
        String userInput = input.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");

        Map<Character, Integer> characterCounts = new HashMap<>();

        /* With created hashmap above, loop through each remaining character and count each occurrence
           after it being initialized */
        for (Character c : userInput.toCharArray()) {
            if (characterCounts.containsKey(c)) {
                characterCounts.put(c, characterCounts.get(c) + 1);
            } else {
                characterCounts.put(c, 1);
            }
        }

        // Display the hashmap
        for (Map.Entry<Character, Integer> element : characterCounts.entrySet()) {
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }
}
