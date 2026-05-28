package com.jad;

import com.jad.plant.*;

public enum Main {
    ;

    public static void main(String[] args) {
        PlantGrowerMatchesExpression isTomateVerteSeed = PlantGrowerMatchesExpression.make("Tomate",
                                                                                           "vert",
                                                                                           PlantState.SEED);
        PlantGrowerMatchesExpression isSeed = PlantGrowerMatchesExpression.make("", "", PlantState.SEED);
        PlantGrowerMatchesExpression isSmall = PlantGrowerMatchesExpression.make("", "", PlantState.SMALL);
        PlantGrowerMatchesExpression isMedium = PlantGrowerMatchesExpression.make("", "", PlantState.MEDIUM);
        PlantGrowerMatchesExpression isLarge = PlantGrowerMatchesExpression.make("", "", PlantState.LARGE);
        PlantGrowerMatchesExpression isDead = PlantGrowerMatchesExpression.make("", "", PlantState.DEAD);

        //PlantGrowerGrowsExpression increasePlantState = PlantGrowerGrowsExpressionParser.parse("State+");
        PlantGrowerGrowsExpression increasePlantState = new PlantGrowerGrowsExpressionPlanteStateIncrease();
        PlantGrowerGrowsExpression noOp = new PlantGrowerGrowsExpressionNoOp();
        PlantGrowerGrowsExpression kill = new PlantGrowerGrowsExpressionKill();

        PlantGrower plantGrower = new PlantGrower(isTomateVerteSeed::interpret, kill::interpret);
        plantGrower.addNext(new PlantGrower(isSeed::interpret, increasePlantState::interpret));
        plantGrower.addNext(new PlantGrower(isSmall::interpret, increasePlantState::interpret));
        plantGrower.addNext(new PlantGrower(isMedium::interpret, increasePlantState::interpret));
        plantGrower.addNext(new PlantGrower(isLarge::interpret, increasePlantState::interpret));
        plantGrower.addNext(new PlantGrower(isDead::interpret, noOp::interpret));

        Garden garden = new Garden(plantGrower);
        garden.add(new Plant("Tomate", "rouge"));
        garden.add(new Plant("Tomate", "vert"));
        garden.add(new Plant("Courgette", "vert"));
        garden.add(new Plant("Aubergine", "violet"));
        System.out.println(garden);

        garden.growAllPlants();
        System.out.println(garden);

        garden.growAllPlants();
        System.out.println(garden);

    }
}