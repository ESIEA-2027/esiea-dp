package com.jad.divinity;

import com.jad.person.Person;

public class Demon extends AbstractDivinity {
    @Override
    public void visitPerson(final Person person) {
        System.out.println(
                "Démon visite " + person.getName() + " avec le statut social " + person.getSocialStatus().getLabel());
    }
}
