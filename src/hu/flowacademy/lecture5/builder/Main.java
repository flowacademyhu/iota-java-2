package hu.flowacademy.lecture5.builder;

public class Main {

    public static void main(String[] args) {
        House house = House.builder()
                .numberOfWalls(4)
                .hasRoof(false)
                .numberOfWindows(3)
                .hasGarage(true)
                .hasFancyStatues(true)
                .numberOfDoors(3)
                .hasGarden(true)
                .hasSwimmingPool(true)
                .build();

        System.out.println(house.toString());
    }

}
