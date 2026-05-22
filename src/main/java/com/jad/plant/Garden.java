package com.jad.plant;

import java.util.ArrayList;

public class Garden extends ArrayList<Plant> {
    private PlantGrower grower;

    public Garden(PlantGrower grower) {
        this.grower = grower;
    }

    public void growAllPlants() {
        for (Plant plant : this) {
            this.grower.grow(plant);
        }
    }

    ;

    @Override
    public String toString() {
        return "Garden{} " + super.toString();
    }
}
