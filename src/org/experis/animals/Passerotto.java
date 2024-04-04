package org.experis.animals;

public class Passerotto extends Animale {
    @Override
    public void verso() {
        System.out.println("Cip");
    }

    @Override
    public void mangia() {
        System.out.println("Frutta e frutta secca");
    }
}
