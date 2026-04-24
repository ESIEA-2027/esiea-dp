package com.jad;

public class Mallard extends AbstractDuck {
    public Mallard(final String name) {
        super(name);
    }

    @Override
    public String quack() {
        return "Coin coin";
    }
    @Override
    public String fly() {
        return "Je vole";
    }
}
