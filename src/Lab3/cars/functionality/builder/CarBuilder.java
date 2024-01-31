package Lab3.cars.functionality.builder;

import Lab3.cars.entity.Car;

public interface CarBuilder {
  void buildEngine();

  void buildWheels();

  void buildRoofs();

  void buildBody();

  Car getCar();
}
