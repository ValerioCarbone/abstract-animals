package org.experis.animals;


public class CreateAnimal {
    public static void main(String[] args) {
        Passerotto pippo = new Passerotto();

        faiVolare(pippo);

        Delfino flipper = new Delfino();

        faiNuotare(flipper);


    }

    public static void faiVolare(Animale animal) {
        try {
            ((CheVola) animal).vola();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public static void faiNuotare(Animale animal) {
        try {
            ((CheNuota) animal).nuota();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

}
