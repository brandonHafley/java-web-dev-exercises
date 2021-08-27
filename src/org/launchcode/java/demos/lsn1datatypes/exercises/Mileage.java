package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class Mileage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas have you used?");
        double gallonsOfGas = input.nextDouble();

        System.out.println("You get " + (milesDriven / gallonsOfGas) + " miles per gallon.");
    }
}
