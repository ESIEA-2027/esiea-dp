package com.jad.person;

abstract class AbstractPerson implements Person {
    private final String name;
    private final SocialStatus socialStatus;

    AbstractPerson(final String name, final SocialStatus socialStatus) {
        this.name = name;
        this.socialStatus = socialStatus;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public SocialStatus getSocialStatus() {
        return this.socialStatus;
    }
}
