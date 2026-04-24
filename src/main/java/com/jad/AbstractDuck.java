package com.jad;

public abstract class AbstractDuck {
    private final String name;

    protected AbstractDuck(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String quack();

    public abstract String fly();
}
