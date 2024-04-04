package org.experis.animals;

public class Aquila extends Animale {
    @Override
    public void verso() {
        System.out.println("Grida");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }
}
