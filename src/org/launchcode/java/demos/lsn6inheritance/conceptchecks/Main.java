package org.launchcode.java.demos.lsn6inheritance.conceptchecks;

class Message {
    private boolean friendly = true;
    private String language;
    private String text;
    private boolean waving;

    public Message(String aLanguage, String aText) {
        language = aLanguage;
        text = aText;
    }

    public boolean isFriendly() {
        return friendly;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }
}

class Greeting extends Message {
    private boolean waving;

    public Greeting(String aLanguage, String aText) {
        super(aLanguage, aText);
    }

    public void wave() {
        waving = true;
    }
}
public class Main {

    public static void main(String[] args) {
        Greeting hello = new Greeting("English", "Hello Coder!");
        hello.wave();
    }
}

