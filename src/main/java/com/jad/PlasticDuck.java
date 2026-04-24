package com.jad;

public class PlasticDuck extends AbstractDuck {
    public PlasticDuck(final String name) {
        super(name, (duck) -> duck.getName() + " : Pouet...");
    }

    @Override
    public String quack() {
        return "Pouet pouet";
    }
}
