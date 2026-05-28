package com.jad.plant;

public class PlantGrowerMatchesExpressionAnd implements PlantGrowerMatchesExpression {
    private final PlantGrowerMatchesExpression left;
    private final PlantGrowerMatchesExpression right;

    public PlantGrowerMatchesExpressionAnd(final PlantGrowerMatchesExpression left,
                                           final PlantGrowerMatchesExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(final Plant plant) {
        return this.left.interpret(plant) && this.right.interpret(plant);
    }
}
