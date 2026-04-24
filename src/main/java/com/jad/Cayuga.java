package com.jad;

public class Cayuga extends AbstractDuck {
    public Cayuga(final String name) {
        super(name);
    }

    @Override
    public String quack() {
        return "Quack quack";
    }

    @Override
    public String fly() {
        return "I'm flying";
    }
}
