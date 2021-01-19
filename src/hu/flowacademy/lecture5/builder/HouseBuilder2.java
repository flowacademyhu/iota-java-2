package hu.flowacademy.lecture5.builder;

public class HouseBuilder2 {
    private int numberOfWalls;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasRoof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasFancyStatues;
    private boolean hasGarden;

    public HouseBuilder2 numberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
        return this;
    }

    public HouseBuilder2 numberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public HouseBuilder2 numberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public HouseBuilder2 hasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return this;
    }

    public HouseBuilder2 hasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder2 hasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    public HouseBuilder2 hasFancyStatues(boolean hasFancyStatues) {
        this.hasFancyStatues = hasFancyStatues;
        return this;
    }

    public HouseBuilder2 hasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        return new House(
                numberOfWalls, numberOfWindows, numberOfDoors,
                hasRoof, hasGarage, hasSwimmingPool, hasFancyStatues,
                hasGarden
        );
    }
}
