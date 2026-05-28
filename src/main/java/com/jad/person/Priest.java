package com.jad.person;

import com.jad.divinity.AbstractDivinity;

public class Priest extends AbstractPerson {
    private final Diocese diocese;

    public Priest(final String name, final Diocese diocese) {
        super(name, SocialStatus.CLERGY);
        this.diocese = diocese;
    }

    public String getDioceseName() {
        return this.diocese.getName();
    }

    public int getDiocesePopulation() {
        return this.diocese.getCountPeople();
    }
    @Override
    public void visitedBy(final AbstractDivinity divinity) {
        divinity.visitPerson(this);
    }
}
