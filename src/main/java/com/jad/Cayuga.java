package com.jad;

public class Cayuga extends AbstractDuck {
    public Cayuga(final String name) {
        super(name, BehaviorFly.NORMAL_FLY_ENGLISH);
    }

    @Override
    public String quack() {
        return "Quack quack";
    }
}
