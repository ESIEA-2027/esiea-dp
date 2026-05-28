package com.jad.person;

import com.jad.divinity.AbstractDivinity;

public class Peon extends AbstractPerson {
    private final int sonsCount;

    public Peon(final String name, final int sonsCount) {
        super(name, SocialStatus.PEASANT);
        this.sonsCount = sonsCount;
    }

    public int getSonsCount() {
        return this.sonsCount;
    }
    @Override
    public void visitedBy(final AbstractDivinity divinity) {
        divinity.visitPerson(this);
    }
}
