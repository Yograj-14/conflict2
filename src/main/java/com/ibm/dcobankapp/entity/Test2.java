package com.ibm.dcobankapp.entity;

public class Test2 {
    public static void main(String[] args) {
        // Array of Instrument references
        Test[] instruments = new Test[10];

        // Assign different types of instruments to the array
        instruments[0] = new Piano();
        instruments[1] = new Flute();
        instruments[2] = new Guitar();
        instruments[3] = new Piano();
        instruments[4] = new Flute();
        instruments[5] = new Guitar();
        instruments[6] = new Piano();
        instruments[7] = new Flute();
        instruments[8] = new Guitar();
        instruments[9] = new Piano();

        // Demonstrate polymorphic behavior
        for (Test instrument : instruments) {
            instrument.play(); // Calls the overridden play method
        }
    }
}
