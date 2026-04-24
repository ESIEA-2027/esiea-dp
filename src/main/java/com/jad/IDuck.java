package com.jad;

public interface IDuck {
    IBehaviorFly getBehaviorFly();

    void setBehaviorFly(IBehaviorFly behaviorFly);

    String getName();

    String quack();

    String fly();
}
