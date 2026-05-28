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

        System.out.println(switch (person) {
            case King king ->
                    "Vous êtes béni par les cieux votre Majesté et votre royaume " + king.getCountryRegentedName() + " aussi !";
            case Peon peon -> "Prie et va bosser ! Demande à tes " + peon.getSonsCount() + " de faire pareil !";
            case Priest priest -> "Demande à tes ouailles de prier et d'aller bosser !";
            case Pope pope -> "Vous êtes béni par les cieux votre Sainteté !";
            case Stranger stranger -> "Convertis-toi ou meurs !";
            case WineMerchant wineMerchant -> "Prie et fais un gros don à l'église !";
            default -> throw new IllegalStateException("Unexpected value: " + person);
        });
    }
}
