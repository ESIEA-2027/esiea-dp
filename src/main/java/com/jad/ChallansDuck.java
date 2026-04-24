package com.jad;

public class ChallansDuck extends AbstractDuck {
    public ChallansDuck(final String name) {
        super(name, BehaviorFly.NORMAL_FLY_FRENCH);
    }

    @Override
    public String quack() {
        return "Coin coin";
    }
}
