package com.jad.plant;

public class PlantGrower {
    private final Predicate predicate;
    private final Grower grower;
    private PlantGrower next;

    public PlantGrower(Predicate predicate, Grower grower) {
        this.predicate = predicate;
        this.grower = grower;
        this.next = null;
    }

    public void addNext(PlantGrower next) {
        if (this.next == null) {
            this.next = next;
        } else {
            this.next.addNext(next);
        }
    }

    public void grow(Plant plant) {
        if (this.predicate.matches(plant)) {
            this.grower.grow(plant);
        } else {
            if (this.next != null) {
                this.next.grow(plant);
            } else {
                throw new IllegalStateException("No grower for this plant");
            }
        }
    }

    ;

    @FunctionalInterface
    public interface Predicate {
        boolean matches(Plant plant);
    }

    @FunctionalInterface
    public interface Grower {
        void grow(Plant plant);
    }
}
