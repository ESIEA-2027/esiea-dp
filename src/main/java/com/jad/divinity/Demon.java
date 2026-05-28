package com.jad.divinity;

import com.jad.person.*;

public class Demon extends AbstractDivinity {
    @Override
    public void visitPerson(final Person person) {
        System.out.println(
                "Démon visite " + person.getName() + " avec le statut social " + person.getSocialStatus().getLabel());
    }

    @Override
    public void visitPerson(final King king) {
        
    }

    @Override
    public void visitPerson(final Peon peon) {

    }

    @Override
    public void visitPerson(final Priest priest) {

    }

    @Override
    public void visitPerson(final Pope pope) {

    }

    @Override
    public void visitPerson(final Stranger stranger) {

    }

    @Override
    public void visitPerson(final WineMerchant wineMerchant) {

    }
}
