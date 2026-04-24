package com.jad.duck.realduck;

public class PlasticDuck extends AbstractDuck {
    public PlasticDuck(final String name) {
        super(name, (duck) -> duck.getName() + " : Pouet...");
    }

    @Override
    public String quack() {
        return "Pouet pouet";
    }

    @Override
    public String toPrettyString() {
        return "    \n" +
                "(°°)\n" +
                " () \n";
    }

}
