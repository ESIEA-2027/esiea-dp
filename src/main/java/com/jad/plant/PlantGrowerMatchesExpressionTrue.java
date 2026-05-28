package com.jad.plant;

public class PlantGrowerMatchesExpressionTrue implements PlantGrowerMatchesExpression {
    @Override
    public boolean interpret(final Plant plant) {
        return true;
    }
}
