package com.jad.duck.realduck;

import com.jad.duck.behavior.BehaviorFly;

public class Cayuga extends AbstractDuck {
    public Cayuga(final String name) {
        super(name, BehaviorFly.NORMAL_FLY_ENGLISH);
    }

    @Override
    public String quack() {
        return "Quack quack";
    }

    @Override
    public String toPrettyString() {
        return "    \n" +
                "(°°)\n" +
                " [] \n";
    }
}
