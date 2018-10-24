package com.company;

public class Main {

    public static void main(String[] args) {
        //Instantiation of an object of Type AlienXenomorph
        AlienXenomorph alienXenomorph = new AlienXenomorph();
        alienXenomorph.acidBlood();
        alienXenomorph.iAmAXenomorph();

        //Instantiation of an object of Type HumanXenomorph, which extends AlienXenomorph
        HumanXenomorph humanXenomorph = new HumanXenomorph();
        humanXenomorph.walkLikeAHuman();
        //attempt of trying to access methods of parent class
        humanXenomorph.acidBlood();

        //Instantiation of an object of Type DogXenomorph
        DogXenomorph dogXenomorph = new DogXenomorph();
        dogXenomorph.iHaveATail();
        dogXenomorph.acidBlood();
        //A previous attempt did not allow dogX to access AlienXenomorph methods
        //The problem being the dog class did not extends AlienXenomorph

        //Instantiation of an Object of Type PredatorXenomorph
        PredatorXenomorph predatorXenomorph = new PredatorXenomorph();
        predatorXenomorph.camoMode();
        predatorXenomorph.acidBlood();
        predatorXenomorph.iAmAXenomorph();

        //Pies and classes
        //Pie cherryPie = new Pie();
        //cherryPie.pieIsBAked();
        Pie.pieIsBAked();
        //using a PIE object as is, and using it's method allows to print, so you don't always have to have an instance of,
        //you can have the object as is and use it, although this means it's the OG and not a customizable one
    }
}
