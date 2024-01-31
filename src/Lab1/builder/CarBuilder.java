package Lab1.builder;

import Lab1.entity.Car;

public interface CarBuilder {
    void buildEngine();

    void buildWheels();

    void buildRoofs();

    void buildBody();

    Car getCar();
}