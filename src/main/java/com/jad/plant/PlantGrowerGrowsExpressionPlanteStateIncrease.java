package com.jad.plant;

public class PlantGrowerGrowsExpressionPlanteStateIncrease implements PlantGrowerGrowsExpression {

    @Override
    public void interpret(final Plant plant) {
        if (plant.getPlantstate().ordinal() == PlantState.values().length) return;
        plant.setPlantstate(PlantState.values()[plant.getPlantstate().ordinal() + 1]);
    }
}
