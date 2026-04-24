package com.jad;

public class Mallard extends AbstractDuck {
    public Mallard(final String name) {
        super(name, BehaviorFly.NORMAL_FLY_FRENCH);
    }

    @Override
    public String quack() {
        return "Coin coin";
    }
}
