package com.jad.plant;

@FunctionalInterface
public interface PlantGrowerMatchesExpression {
    static PlantGrowerMatchesExpression make(String name, String color, PlantState plantState) {
        PlantGrowerMatchesExpression result = null;
        if (name.isEmpty() && color.isEmpty() && plantState == null) return new PlantGrowerMatchesExpressionTrue();
        if (!name.isEmpty()) result = new PlantGrowerMatchesExpressionNameEquals(name);
        if (!color.isEmpty()) {
            result = (result == null)
                    ? new PlantGrowerMatchesExpressionColorEquals(color)
                    : new PlantGrowerMatchesExpressionAnd(result, new PlantGrowerMatchesExpressionColorEquals(color));
        }
        if (plantState != null) {
            result = (result == null)
                    ? new PlantGrowerMatchesExpressionPlantStateEquals(plantState)
                    : new PlantGrowerMatchesExpressionAnd(result,
                                                          new PlantGrowerMatchesExpressionPlantStateEquals(plantState));
        }
        return result;
    }

    boolean interpret(Plant plant);
}
