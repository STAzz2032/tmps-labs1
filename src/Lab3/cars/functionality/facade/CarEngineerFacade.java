package Lab3.cars.functionality.facade;

import Lab3.cars.functionality.builder.CarBuilder;
import Lab3.cars.entity.Car;
import Lab3.cars.entity.CarEngineer;

public class CarEngineerFacade implements CarEngineer {
  private final CarBuilder carBuilder;
  private int yearsOfExperience;

  public CarEngineerFacade(CarBuilder carBuilder, int yearsOfExperience) {
    this.carBuilder = carBuilder;
    this.yearsOfExperience = yearsOfExperience;
  }

  public Car getCar() {
    return carBuilder.getCar();
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  @Override
  public void buildCar() {
    carBuilder.buildBody();
    carBuilder.buildEngine();
    carBuilder.buildRoofs();
    carBuilder.buildWheels();
  }
}
