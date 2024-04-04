package org.experis.animals;

public class Cane extends Animale {
    @Override
    public void verso() {
        System.out.println("Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Erba e carne");
    }
}
