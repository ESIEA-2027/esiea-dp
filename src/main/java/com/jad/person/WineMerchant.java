package com.jad.person;

public final class WineMerchant extends AbstractPerson {
    private final int wealth;

    public WineMerchant(final String name, final int wealth) {
        super(name, SocialStatus.BOURGEOIS);
        this.wealth = wealth;
    }

    public int getWealth() {
        return this.wealth;
    }
}
