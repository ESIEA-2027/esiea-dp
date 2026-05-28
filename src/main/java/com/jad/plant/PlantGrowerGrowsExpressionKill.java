package com.jad.plant;

public class PlantGrowerGrowsExpressionKill implements PlantGrowerGrowsExpression {

    @Override
    public void interpret(final Plant plant) {
        plant.setPlantstate(PlantState.DEAD);
    }
}
