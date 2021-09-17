package org.launchcode.java.demos.lsn6inheritance.exercises.technology;

public class Computer extends AbstractEntity {
    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int ram, int storage, boolean hasKeyboard) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public void increaseRam(int ramAdded) {
        this.ram += ramAdded;
    }

    public void increaseStorage(int storageAdded) {
        this.storage += storageAdded;
    }
}
