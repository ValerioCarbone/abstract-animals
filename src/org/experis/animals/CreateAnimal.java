package org.experis.animals;


public class CreateAnimal {
    public static void main(String[] args) {
        Passerotto pippo = new Passerotto();

        faiVolare(pippo);

        Delfino flipper = new Delfino();

        faiNuotare(flipper);



    }
    public static void faiVolare(Animale animal){
        if(animal instanceof CheVola) {
            ((CheVola) animal).vola();
        }
    }

    public static void faiNuotare(Animale animal) {
        if (animal instanceof CheNuota) {
            ((CheNuota) animal).nuota();
        }
    }

}
