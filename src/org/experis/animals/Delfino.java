package org.experis.animals;

public class Delfino extends Animale implements CheNuota{
    @Override
    public void verso() {
        System.out.println("Click");
    }

    @Override
    public void mangia() {
        System.out.println("Pesci e molluschi");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
