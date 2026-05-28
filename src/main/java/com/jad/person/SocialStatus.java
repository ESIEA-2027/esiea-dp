package com.jad.person;

public enum SocialStatus {
    NOBLE("Noble"),
    CLERGY("Ecclésiastique"),
    BOURGEOIS("Bourgeois"),
    PEASANT("Paysan"),
    UNBELIEVER("Mécréant");

    private final String label;

    SocialStatus(final String label) {
        this.label = label;
    }

    public static String getLabel(SocialStatus socialStatus) {
        return socialStatus.getLabel();
    }

    public String getLabel() {
        return this.label;
    }
}
