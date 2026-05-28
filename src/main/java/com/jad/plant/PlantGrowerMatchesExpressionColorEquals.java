package com.jad.plant;

public class PlantGrowerMatchesExpressionColorEquals implements PlantGrowerMatchesExpression {
    private final String expected;

    public PlantGrowerMatchesExpressionColorEquals(final String expected) {
        this.expected = expected;
    }

    @Override
    public boolean interpret(final Plant plant) {
        return plant.getColor().equals(this.expected);
    }
}
