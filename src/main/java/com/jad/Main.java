package com.jad;

import com.jad.customer.Customer;
import com.jad.customer.CustomerVIP;
import com.jad.customer.ICustomer;

// Reste à faire le strategy sur le quack
public enum Main {
    ;

    public static void main(String[] args) {
//        Cayuga carole = new Cayuga("Carole");
//        Mallard donald = new Mallard("Donald");
//        ChallansDuck barnabe = new ChallansDuck("Barnabé");
//        PlasticDuck sophie = new PlasticDuck("Sophie");
//
//        DuckFarm ducks = new DuckFarm();
//        ducks.add(carole);
//        ducks.add(donald);
//        ducks.add(sophie);
//        ducks.add(barnabe);
//
//        ducks.quackAll();
//        System.out.println("-------------");
//        ducks.flyAll();
//
//        // Une fée vient voir Sophie, car c'est une très gentille canne en plastique.
//        // Pour la remercier d'être si gentille, la fée lui offre une cape magique.
//        // Sophie est désormais capable de voler.
//        System.out.println("-------------");
//        sophie.setBehaviorFly((duck) -> "Super" + duck.getName() + " : Je vole comme superman avec ma cape magique");
//        ducks.flyAll(); // Sophie doit maintenant dire "Sophie : Je vole comme superman avec ma cape magique
//
//
//        // Barnabé fait un stage Erasmus chez Carole
//        System.out.println("-------------");
//        ducks.quackAll(); // Barnabé doit maintenant dire "Barnabé : I am flying
//
//        // Donald jaloux de Sophie, veut, lui aussi, avoir une cape, il s'en fait une
//        System.out.println("-------------");
//        donald.setBehaviorFly(sophie.getBehaviorFly());
//        ducks.flyAll(); // Donald doit maintenant dire "Donald : Je vole comme superman avec ma cape magique
        ICustomer jad = new Customer("Jean-Aymeric", "Diet", 1);
        ICustomer javotte = new Customer("Anne-Javotte", "Diet", 2);
        jad.buy("un livre");
        javotte.buy("une place de concert");
        javotte = new CustomerVIP(javotte);
        javotte.buy("une place de concert");

        jad.setBuyBehavior((item) -> {
            throw new RuntimeException("Je ne peux pas acheter ");
        });
        jad.buy("un livre");
    }
}