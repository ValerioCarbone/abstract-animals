package org.experis.animals;

public class Aquila extends Animale implements CheVola{
    @Override
    public void verso() {
        System.out.println("Grida");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
