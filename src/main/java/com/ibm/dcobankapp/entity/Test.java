package com.ibm.dcobankapp.entity;

public abstract class Test {
    // Abstract method
    abstract void play();
}

class Piano extends Test {
    // Overriding play method for Piano
    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Test {
    // Overriding play method for Flute
    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Test {
    // Overriding play method for Guitar
    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}


