package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        HouseCat cheshireCat = new HouseCat("Chesire", 12);
        System.out.println(cheshireCat.noise());
    }
}
