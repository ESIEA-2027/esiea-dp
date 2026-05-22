package com.jad.plant;

public class Plant {
    private final String name;
    private String color;
    private PlantState plantstate;

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
        this.plantstate = PlantState.SEED;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PlantState getPlantstate() {
        return plantstate;
    }

    public void setPlantstate(PlantState plantstate) {
        this.plantstate = plantstate;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", plantstate=" + plantstate +
                '}';
    }
}
