package org.experis.animals;

public class Passerotto extends Animale implements CheVola{
    @Override
    public void verso() {
        System.out.println("Cip");
    }

    @Override
    public void mangia() {
        System.out.println("Frutta e frutta secca");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
