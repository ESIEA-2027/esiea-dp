package com.jad.person;

public final  class Stranger extends AbstractPerson {
    public Stranger(final String name) {
        super(name, SocialStatus.UNBELIEVER);
    }

    String getInformation() {
        return "Bla bla bla, Ph’nglui mglw’nafh Cthulhu R’lyeh wgah’nagl fhtagn.";
    }
}
