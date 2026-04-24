package com.jad;

import com.jad.duck.IDuck;
import com.jad.duck.duckdecorator.HairDuckDecorator;
import com.jad.duck.duckdecorator.LeftOneEyedDuckDecorator;
import com.jad.duck.duckdecorator.TatooRightDuckDecorator;
import com.jad.duck.duckdecorator.VampireDuckDecorator;
import com.jad.duck.realduck.Cayuga;
import com.jad.duck.realduck.Mallard;
import com.jad.duck.realduck.PlasticDuck;

public enum Main {
    ;

    public static void main(String[] args) {
        IDuck carole = new Cayuga("Carole");
        IDuck donald = new Mallard("Donald");
        IDuck sophie = new PlasticDuck("Sophie");

        System.out.println(carole.toPrettyString());
        System.out.println(donald.toPrettyString());

        // Carole vient de se faire mordre par un vampire
        carole = new VampireDuckDecorator(carole);
        System.out.println(carole.toPrettyString());

        // Donald est allé en Turquie pour se faire des implants
        donald = new HairDuckDecorator(donald);
        System.out.println(donald.toPrettyString());

        // Carole va mordre Donald, qui donc va se transformer lui aussi en vampire
        donald = new VampireDuckDecorator(donald);
        System.out.println(donald.toPrettyString());

        // Donald s'est fait tatouage sur la joue droite
        donald = new TatooRightDuckDecorator(donald);
        System.out.println(donald.toPrettyString());

        // Donald s'est bagarré et s'est fait crever l'œil gauche
        donald = new LeftOneEyedDuckDecorator(donald);
        System.out.println(donald.toPrettyString());
        System.out.println(sophie.quack());
        sophie = new VampireDuckDecorator(sophie);
        System.out.println(sophie.quack());

    }
}