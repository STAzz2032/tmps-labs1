package Lab3.cars.functionality.builder.factory;

import Lab3.cars.functionality.builder.CarBuilder;
import Lab3.cars.functionality.builder.CarTypes;
import Lab3.cars.functionality.builder.implementation.NewCarBuilder;
import Lab3.cars.functionality.builder.implementation.OldCarBuilder;

public class CarBuilderFactory {
  public static CarBuilder generateCarBuilder(CarTypes carType) {
    switch (carType) {
      case NEW:
        return new NewCarBuilder();
      case OLD:
        return new OldCarBuilder();
      default:
        System.out.println("No such type!");
        return null;
    }
  }
}
