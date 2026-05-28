package com.jad.divinity;

import com.jad.person.*;

public class Angel extends AbstractDivinity {
    @Override
    public void visitPerson(final Person person) {
        System.out.println(
                "Angel visite " + person.getName() +
                        " avec le statut social " + SocialStatus.getLabel(person.getSocialStatus()));
        // Si c'est un roi, on lui dit "Vous êtes béni par les cieux votre Majesté et votre royaume <non du royaume> aussi !"
        // Si c'est un peon, on lui dit "Prie et va bosser ! Demande à tes <nbFils> de faire pareil !"
        // Si c'est un prêtre, on lui dit "Demande à tes ouailles de prier et d'aller bosser !"
        // Si c'est un pape, on lui dit "Vous êtes béni par les cieux votre Sainteté !"
        // Si c'est un étranger, on lui dit "Convertis-toi ou meurs !"
        // Si c'est un marchand de vin, on lui dit "Prie et fais un gros don à l'église !"
        // Instanceof et typeOf sont interdits
        person.visitedBy(this);
        System.out.println("-------------------------------\n");
    }

    @Override
    public void visitPerson(final King king) {
        System.out.println(
                "Vous êtes béni par les cieux votre Majesté et votre royaume " + king.getCountryRegentedName() + " aussi !");
    }

    @Override
    public void visitPerson(final Peon peon) {
        System.out.println("Prie et va bosser ! Demande à tes " + peon.getSonsCount() + " fils de faire pareil !");
    }

    @Override
    public void visitPerson(final Priest priest) {
        System.out.println("Demande à tes ouailles de prier et d'aller bosser !");
    }

    @Override
    public void visitPerson(final Pope pope) {
        System.out.println("Vous êtes béni par les cieux votre Sainteté !");
    }

    @Override
    public void visitPerson(final Stranger stranger) {
        System.out.println("Convertis-toi ou meurs !");
        System.out.println(stranger.getName() + " : " + stranger.getInformation());
        System.out.println("MEURS MECREANT !");
    }

    @Override
    public void visitPerson(final WineMerchant wineMerchant) {
        System.out.println("Prie et fais un gros don de " + wineMerchant.getWealth() / 10 + " à l'église !");
    }
}
