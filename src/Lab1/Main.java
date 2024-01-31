package Lab1;

import Lab1.builder.CarBuilder;
import Lab1.builder.CarCreation;
import Lab1.entity.Car;

public class Main {

    public static void main(String[] args) {

        CarBuilder carBuilder = CarCreation.generateCarBuilder();

        CarEngineer carEngineer = new CarEngineer(carBuilder);
        carEngineer.buildCar();

        Car car = carEngineer.getCar();

        System.out.println(car.getBody());
        System.out.println(car.getEngine());
        System.out.println(car.getRoof());
        System.out.println(car.getWheels());
    }
}
