package com.jad.duck.proxy;

import com.jad.duck.IDuck;
import com.jad.duck.behavior.IBehaviorFly;

public class ProxyDuck implements IDuck {
    private final IDuck duck;
    private String cachedQuack = null;

    public ProxyDuck(final IDuck duck) {
        this.duck = duck;
    }

    @Override
    public IBehaviorFly getBehaviorFly() {
        return this.duck.getBehaviorFly();
    }

    @Override
    public void setBehaviorFly(final IBehaviorFly behaviorFly) {
        this.duck.setBehaviorFly(behaviorFly);
    }

    @Override
    public String getName() {
        return this.duck.getName();
    }

    @Override
    public String quack() {
        System.out.println("Appel à la méthode quack de " + this.duck.getName());
        if (this.cachedQuack == null) {
            this.cachedQuack = this.duck.quack();
        }
        return this.cachedQuack;
    }

    @Override
    public String fly() {
        return this.duck.fly();
    }

    @Override
    public String toPrettyString() {
        return this.duck.toPrettyString();
    }
}
