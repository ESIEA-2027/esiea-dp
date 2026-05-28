package com.jad.person;

public final class Peon extends AbstractPerson {
    private final int sonsCount;

    public Peon(final String name, final int sonsCount) {
        super(name, SocialStatus.PEASANT);
        this.sonsCount = sonsCount;
    }

    public int getSonsCount() {
        return this.sonsCount;
    }
}
