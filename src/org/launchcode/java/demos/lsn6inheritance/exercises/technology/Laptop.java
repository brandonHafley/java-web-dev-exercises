package org.launchcode.java.demos.lsn6inheritance.exercises.technology;

public class Laptop extends Computer {
    private double weight;

    public Laptop(int ram, int storage, boolean hasKeyboard, double weight) {
        super(ram, storage, hasKeyboard);
        this.weight = weight;
    }

    public boolean isBulky() {
        return weight > 5;
    }
}
