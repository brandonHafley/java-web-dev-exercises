package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length:");
        int length = input.nextInt();

        System.out.println("Width:");
        int width = input.nextInt();

        System.out.println("The area of the rectangle is " + (length * width));
    }
}
