package Lab3.cars.functionality.adapter;

import Lab3.cars.entity.Car;

public class RedCarAdapter implements CarAdapter {
  private final Car car;

  private final String redColor = " of red color.";

  public RedCarAdapter(Car car) {
    this.car = car;
    car.setEngine(car.getEngine() + redColor);
    car.setBody(car.getBody() + redColor);
    car.setRoof(car.getRoof() + redColor);
    car.setWheels(car.getWheels() + redColor);
  }

  @Override
  public Car getCar() {
    return car;
  }
}
