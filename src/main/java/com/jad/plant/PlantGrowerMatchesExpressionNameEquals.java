package com.jad.plant;

public class PlantGrowerMatchesExpressionNameEquals implements PlantGrowerMatchesExpression {
    private final String expected;

    public PlantGrowerMatchesExpressionNameEquals(final String expected) {
        this.expected = expected;
    }

    @Override
    public boolean interpret(final Plant plant) {
        return plant.getName().equals(this.expected);
    }
}
