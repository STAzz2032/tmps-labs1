package Lab4.cars.functionality.builder;

import Lab4.cars.entity.Car;

public interface CarBuilder {
  void buildEngine();

  void buildWheels();

  void buildRoofs();

  void buildBody();

  Car getCar();
}
