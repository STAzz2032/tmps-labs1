# *SOLID Principles*
# Author: *Bandalac Sergiu FAF-212**
------
## Introduction :

This is a project that simulates the building of a sample car.

## Main idea :

The main entity is the Car. It has 4 main elements which is Body Engine Roof and Wheels.
I have defined the Car Entity and the CarPlan interface. In order to recieve sample car elements displayed I have 
created Car Sample class which inherits the CarBuilder properties. The CarCreation class contain one function that returs 
the SampleCar values.

## Implementation and explanation :

Defined the CarPlan class:
```
    public interface CarPlan {
    
        void setEngine(String engine);

        void setWheels(String wheels);

        void setRoof(String roof);

        void setBody(String body);
}
    ...
```


I have used a little from Builder pattern. It allows creating different car representations
using the same creation process. In my case, the Car Engineer can create a sample car, using different implementations
of Car Builder (CarBuilder interface).

```
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
```
One important part is that the Car Engineer is not dependent on specific implementations of Car Builder.

## Results:

For now, I have provided a simple result - a simple print of the fields from the created Car.
Example:

![Capture](https://github.com/STAzz2032/tmps-labs1/assets/70953182/6597c90c-121a-4fd8-99e8-770ac08e8dd8)

## Conclusions
In this project I have defined the main classes of an car creation and used inherition for some methods to make them more functional for further labs.
