package com.jad.duck.duckdecorator;

import com.jad.duck.IDuck;
import com.jad.duck.behavior.IBehaviorFly;

public abstract class AbstractDuckDecorator implements IDuck {
    private final IDuck duckDecorated;

    protected AbstractDuckDecorator(final IDuck duckDecorated) {
        this.duckDecorated = duckDecorated;
    }

    @Override
    public IBehaviorFly getBehaviorFly() {
        return this.duckDecorated.getBehaviorFly();
    }

    @Override
    public void setBehaviorFly(final IBehaviorFly behaviorFly) {
        this.duckDecorated.setBehaviorFly(behaviorFly);
    }

    @Override
    public String getName() {
        return this.duckDecorated.getName();
    }

    @Override
    public String quack() {
        return this.quackDecorated(this.duckDecorated.quack());
    }

    protected String quackDecorated(final String quack) {
        return quack;
    }

    @Override
    public String fly() {
        return this.duckDecorated.fly();
    }

    @Override
    public String toPrettyString() {
        return this.toPrettyStringDecorated(this.duckDecorated.toPrettyString().split("\n"));
    }

    protected abstract String toPrettyStringDecorated(final String[] split);
}
