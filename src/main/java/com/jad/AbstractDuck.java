package com.jad;

public abstract class AbstractDuck implements IDuck {
    private final String name;
    private IBehaviorFly behaviorFly;

    protected AbstractDuck(final String name,
                           final IBehaviorFly behaviorFly) {
        this.name = name;
        this.behaviorFly = behaviorFly;
    }

    @Override
    public IBehaviorFly getBehaviorFly() {
        return this.behaviorFly;
    }

    @Override
    public void setBehaviorFly(final IBehaviorFly behaviorFly) {
        this.behaviorFly = behaviorFly;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public final String fly() {
        return this.behaviorFly.fly(this);
    }
}
