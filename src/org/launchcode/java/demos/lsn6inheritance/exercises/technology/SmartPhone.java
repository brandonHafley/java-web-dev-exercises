package org.launchcode.java.demos.lsn6inheritance.exercises.technology;

public class SmartPhone extends Computer {
    private int picsTaken;

    public SmartPhone(int ram, int storage, boolean hasKeyboard, int picsTaken) {
        super(ram, storage, hasKeyboard);
        this.picsTaken = picsTaken;
    }

    public int getPicsTaken() {
        return picsTaken;
    }

    public void takePics(int numOfPics) {
        this.picsTaken += numOfPics;
    }
}
