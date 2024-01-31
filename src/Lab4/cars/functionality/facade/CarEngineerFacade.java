package Lab4.cars.functionality.facade;

import Lab4.cars.entity.Car;
import Lab4.cars.entity.CarEngineer;
import Lab4.cars.functionality.builder.CarBuilder;

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
