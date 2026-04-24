package com.jad;

public class PlasticDuck extends AbstractDuck {
    public PlasticDuck(final String name) {
        super(name);
    }

    @Override
    public String quack() {
        return "Pouet pouet";
    }

    @Override
    public String fly() {
        return "Pouet...";
    }
}
