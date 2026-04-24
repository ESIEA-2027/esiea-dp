package com.jad.duck;

import com.jad.duck.behavior.IBehaviorFly;

public interface IDuck {
    IBehaviorFly getBehaviorFly();

    void setBehaviorFly(IBehaviorFly behaviorFly);

    String getName();

    String quack();

    String fly();

    String toPrettyString();
}
