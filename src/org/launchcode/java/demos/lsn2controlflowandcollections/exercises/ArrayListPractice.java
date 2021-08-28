package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> rangeTen = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            rangeTen.add(i);
        }

        System.out.println(sumEvens(rangeTen));

        String rhyme = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word length you want to search for: ");
        int numberOfLetters = input.nextInt();

        wordSearch(rhyme, numberOfLetters);
    }

    private static int sumEvens(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }

    private static void wordSearch(String s, int numberOfLetters) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));

        for (String word : words) {
            if (word.length() == numberOfLetters) {
                System.out.println(word);
            }
        }
    }
}
