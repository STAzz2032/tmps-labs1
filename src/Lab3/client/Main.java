package Lab3.client;

import Lab3.client.singleton.CarEngineeringManager;

public class Main {

  public static void main(String[] args) {
    CarEngineeringManager.getInstance().startProducingCar();
  }
}
