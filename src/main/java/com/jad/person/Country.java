package com.jad.person;

public class Country {
    private final String name;
    private int countPeople;

    public Country(final String name, final int countPeople) {
        this.name = name;
        this.countPeople = countPeople;
    }

    public String getName() {
        return this.name;
    }

    public int getCountPeople() {
        return this.countPeople;
    }
}
