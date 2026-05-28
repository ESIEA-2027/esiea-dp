package com.jad.person;

import com.jad.divinity.AbstractDivinity;

public class WineMerchant extends AbstractPerson {
    private final int wealth;

    public WineMerchant(final String name, final int wealth) {
        super(name, SocialStatus.BOURGEOIS);
        this.wealth = wealth;
    }

    public int getWealth() {
        return this.wealth;
    }

    @Override
    public void visitedBy(final AbstractDivinity divinity) {
        divinity.visitPerson(this);
    }
}
