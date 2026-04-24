package com.jad;

public enum Main {
    ;

    public static void main(String[] args) {
        Cayuga carole = new Cayuga("Carole");
        Mallard donald = new Mallard("Dolnald");
        ChallansDuck barnabe = new ChallansDuck("Barnabé");
        PlasticDuck sophie = new PlasticDuck("Sophie");

        DuckFarm ducks = new DuckFarm();
        ducks.add(carole);
        ducks.add(donald);
        ducks.add(sophie);
        ducks.add(barnabe);

        ducks.quackAll();
        System.out.println("-------------");
        ducks.flyAll();

        // Une fée vient voir Sophie, car c'est une très gentille canne en plastique.
        // Pour la remercier d'être si gentille, la fée lui offre une cape magique.
        // Sophie est désormais capable de voler.
        System.out.println("-------------");
        ducks.flyAll(); // Sophie doit maintenant dire "Sophie : Je vole comme superman avec ma cape magique

        // Barnabé fait un stage Erasmus chez Carole
        System.out.println("-------------");
        ducks.quackAll(); // Barnabé doit maintenant dire "Barnabé : I am flying

        // Donald jaloux de Sophie, vuet lui aussi avoir une cape, il s'en fait une
        System.out.println("-------------");
        ducks.flyAll(); // Donald doit maintenant dire "Donald : Je vole comme superman avec ma cape magique
    }
}