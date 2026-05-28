package com.jad.divinity;

import com.jad.person.Person;
import com.jad.person.SocialStatus;

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
    }
}
