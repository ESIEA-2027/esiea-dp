package com.jad;

import com.jad.plant.Garden;
import com.jad.plant.Plant;
import com.jad.plant.PlantGrower;
import com.jad.plant.PlantState;

public enum Main {
    ;

    public static void main(String[] args) {

        PlantGrower plantGrower = new PlantGrower(
                plant -> plant.getColor().equals("vert")
                        && plant.getName().equals("Tomate")
                        && plant.getPlantstate().equals(PlantState.SEED),
                plant -> plant.setPlantstate(PlantState.DEAD)
        );
        plantGrower.addNext(new PlantGrower(
                plant -> plant.getPlantstate().equals(PlantState.SEED),
                plant -> plant.setPlantstate(PlantState.SMALL))
        );
        plantGrower.addNext(new PlantGrower(
                plant -> plant.getPlantstate().equals(PlantState.SMALL),
                plant -> plant.setPlantstate(PlantState.MEDIUM))
        );
        plantGrower.addNext(new PlantGrower(
                plant -> plant.getPlantstate().equals(PlantState.MEDIUM),
                plant -> plant.setPlantstate(PlantState.LARGE))
        );
        plantGrower.addNext(new PlantGrower(
                plant -> plant.getPlantstate().equals(PlantState.LARGE),
                plant -> plant.setPlantstate(PlantState.DEAD))
        );
        plantGrower.addNext(new PlantGrower(
                plant -> plant.getPlantstate().equals(PlantState.DEAD),
                plant -> {
                })
        );

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