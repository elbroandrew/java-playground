package Pattern;

import Pattern.Builder.Car;

public class Main {

    public static void main(String[] args) {

        Car defaultCar = new Car.CarBuilder().build();
        defaultCar.displayInfo();

        Car redCar = new Car.CarBuilder()
                .withColor("red")
                .build();
        redCar.displayInfo();

        Car johnRedCar = new Car.CarBuilder()
                .withColor("red")
                .withOwner("John")
                .build();
        johnRedCar.displayInfo();
    }
}
