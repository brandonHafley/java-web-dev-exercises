package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        System.out.println("Search for a term: ");
        String searchTerm = input.nextLine();

        System.out.println("Index: " + firstSentence.indexOf(searchTerm) + "\nLength: " + searchTerm.length());
        System.out.println(firstSentence.replace(searchTerm, ""));
    }
}
