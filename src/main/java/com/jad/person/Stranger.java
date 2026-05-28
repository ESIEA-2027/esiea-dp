package com.jad.person;

import com.jad.divinity.AbstractDivinity;

public class Stranger extends AbstractPerson {
    public Stranger(final String name) {
        super(name, SocialStatus.UNBELIEVER);
    }

    public String getInformation() {
        return "Bla bla bla, Ph’nglui mglw’nafh Cthulhu R’lyeh wgah’nagl fhtagn.";
    }
    @Override
    public void visitedBy(final AbstractDivinity divinity) {
        divinity.visitPerson(this);
    }
}
