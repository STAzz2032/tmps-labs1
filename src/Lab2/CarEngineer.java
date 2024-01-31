package Lab2;

import Lab2.builder.CarBuilder;
import Lab2.entity.Car;

public class CarEngineer {
  private final CarBuilder carBuilder;

  public CarEngineer(CarBuilder carBuilder) {
    this.carBuilder = carBuilder;
  }

  public Car getCar() {
    return carBuilder.getCar();
  }

  public void buildCar() {
    carBuilder.buildBody();
    carBuilder.buildEngine();
    carBuilder.buildRoofs();
    carBuilder.buildWheels();
  }
}
