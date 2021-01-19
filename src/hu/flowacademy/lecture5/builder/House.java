package hu.flowacademy.lecture5.builder;

public class House {
    private int numberOfWalls;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasRoof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasFancyStatues;
    private boolean hasGarden;

    public House(int numberOfWalls, int numberOfWindows, int numberOfDoors, boolean hasRoof, boolean hasGarage, boolean hasSwimmingPool, boolean hasFancyStatues, boolean hasGarden) {
        this.numberOfWalls = numberOfWalls;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.hasRoof = hasRoof;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasFancyStatues = hasFancyStatues;
        this.hasGarden = hasGarden;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public String toString() {
        return "House(numberOfWalls=" + this.numberOfWalls + ", numberOfWindows=" + this.numberOfWindows + ", numberOfDoors=" + this.numberOfDoors + ", hasRoof=" + this.hasRoof + ", hasGarage=" + this.hasGarage + ", hasSwimmingPool=" + this.hasSwimmingPool + ", hasFancyStatues=" + this.hasFancyStatues + ", hasGarden=" + this.hasGarden + ")";
    }

    public static class HouseBuilder {
        private int numberOfWalls;
        private int numberOfWindows;
        private int numberOfDoors;
        private boolean hasRoof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasFancyStatues;
        private boolean hasGarden;

        HouseBuilder() {
        }

        public HouseBuilder numberOfWalls(int numberOfWalls) {
            this.numberOfWalls = numberOfWalls;
            return this;
        }

        public HouseBuilder numberOfWindows(int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        public HouseBuilder numberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public HouseBuilder hasRoof(boolean hasRoof) {
            this.hasRoof = hasRoof;
            return this;
        }

        public HouseBuilder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder hasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder hasFancyStatues(boolean hasFancyStatues) {
            this.hasFancyStatues = hasFancyStatues;
            return this;
        }

        public HouseBuilder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(numberOfWalls, numberOfWindows, numberOfDoors, hasRoof, hasGarage, hasSwimmingPool, hasFancyStatues, hasGarden);
        }

        public String toString() {
            return "House.HouseBuilder(numberOfWalls=" + this.numberOfWalls + ", numberOfWindows=" + this.numberOfWindows + ", numberOfDoors=" + this.numberOfDoors + ", hasRoof=" + this.hasRoof + ", hasGarage=" + this.hasGarage + ", hasSwimmingPool=" + this.hasSwimmingPool + ", hasFancyStatues=" + this.hasFancyStatues + ", hasGarden=" + this.hasGarden + ")";
        }
    }
}
