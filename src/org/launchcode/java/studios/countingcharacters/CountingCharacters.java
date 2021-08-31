package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to count each character: ");
        String userInput = input.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");

        Map<Character, Integer> characterCounts = new HashMap<>();

        for (Character c : userInput.toCharArray()) {
            if (characterCounts.containsKey(c)) {
                characterCounts.put(c, characterCounts.get(c) + 1);
            } else {
                characterCounts.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> element : characterCounts.entrySet()) {
            System.out.println(element.getKey() + " - " + element.getValue());
        }
    }
}
