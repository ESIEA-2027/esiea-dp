package com.jad.person;

public class King extends AbstractPerson {
    private final Country regentedCountry;

    public King(final String name, final Country regentedCountry) {
        super(name, SocialStatus.NOBLE);
        this.regentedCountry = regentedCountry;
    }

    public String getCountryRegentedName() {
        return this.regentedCountry.getName();
    }

    public int getCountryRegentedPopulation() {
        return this.regentedCountry.getCountPeople();
    }
}
