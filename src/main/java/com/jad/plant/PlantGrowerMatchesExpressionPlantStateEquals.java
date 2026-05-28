package com.jad.plant;

public class PlantGrowerMatchesExpressionPlantStateEquals implements PlantGrowerMatchesExpression {
    private final PlantState expected;

    public PlantGrowerMatchesExpressionPlantStateEquals(final PlantState expected) {
        this.expected = expected;
    }

    @Override
    public boolean interpret(final Plant plant) {
        return plant.getPlantstate().equals(this.expected);
    }
}
