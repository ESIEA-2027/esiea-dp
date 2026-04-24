package com.jad.duck.behavior;

import com.jad.duck.IDuck;

@FunctionalInterface
public interface IBehaviorFly {
    String fly(final IDuck duck);
}
