package com.jad;

public class ChallansDuck extends AbstractDuck {
    public ChallansDuck(final String name) {
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
