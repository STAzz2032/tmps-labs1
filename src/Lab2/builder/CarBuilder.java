package Lab2.builder;

import Lab2.entity.Car;

public interface CarBuilder {
  void buildEngine();

  void buildWheels();

  void buildRoofs();

  void buildBody();

  Car getCar();
}
