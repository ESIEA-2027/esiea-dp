package com.jad;

public enum BehaviorFly implements IBehaviorFly {
    NORMAL_FLY_ENGLISH((duck) -> "I'm flying"),
    NORMAL_FLY_FRENCH((duck) -> "Je vole");

    private final IBehaviorFly behavior;

    BehaviorFly(final IBehaviorFly behavior) {
        this.behavior = behavior;
    }

    @Override
    public String fly(final IDuck duck) {
        return duck.getName() + " : " + this.behavior.fly(duck);
    }
}
