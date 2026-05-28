package com.jad.person;

public class Pope extends AbstractPerson {
    private final Country administeredCountry;

    public Pope(final String name, final Country administeredCountry) {
        super(name, SocialStatus.CLERGY);
        this.administeredCountry = administeredCountry;
    }

    public String getCountryAdministeredName() {
        return this.administeredCountry.getName();
    }

    public int getCountryAdministeredPopulation() {
        return this.administeredCountry.getCountPeople();
    }
}
