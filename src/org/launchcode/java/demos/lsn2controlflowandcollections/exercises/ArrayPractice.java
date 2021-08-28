package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for(int number : numbers) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }

        System.out.println("\n===================\n");

        String rhyme = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] sentences = rhyme.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
