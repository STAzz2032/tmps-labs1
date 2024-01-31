package Lab1.builder;

import Lab1.entity.Car;

public class SampleCar implements CarBuilder{
    private final Car car;

    public SampleCar() {
        this.car = new Car();
    }

    public Car getCar() {
        return car;
    }

    @Override
    public void buildEngine() {
        car.setEngine("Sample Engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Sample Wheels");
    }

    @Override
    public void buildRoofs() {
        car.setRoof("Sample Roof");
    }

    @Override
    public void buildBody() {
        car.setBody("Sample Body");
    }
}