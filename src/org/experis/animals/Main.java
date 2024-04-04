package org.experis.animals;

public class Main {
    public static void main(String[] args) {
        Cane dog = new Cane();

        Passerotto uccellino = new Passerotto();

        Aquila hawk = new Aquila();

        Delfino curioso = new Delfino();

        dog.mangia();
        dog.verso();
        dog.dormi();

        hawk.mangia();
        hawk.verso();
        hawk.dormi();

        uccellino.mangia();
        uccellino.verso();
        uccellino.dormi();

        curioso.mangia();
        curioso.verso();
        curioso.dormi();
    }
}
