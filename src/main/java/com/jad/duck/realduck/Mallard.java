package com.jad.duck.realduck;

import com.jad.duck.behavior.BehaviorFly;

public class Mallard extends AbstractDuck {
    public Mallard(final String name) {
        super(name, BehaviorFly.NORMAL_FLY_FRENCH);
    }

    @Override
    public String quack() {
        return "Coin coin";
    }

    @Override
    public String toPrettyString() {
        return "    \n" +
                "(°°)\n" +
                " !! \n";
    }

}
