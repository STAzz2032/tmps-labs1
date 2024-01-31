package Lab4.client;

import Lab4.cars.data.DataSource;
import Lab4.cars.data.clients.Client;
import Lab4.client.singleton.CarEngineeringManager;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    DataSource.getInstance()
        .setClients(
            new LinkedList<>(
                Arrays.asList(
                    new Client("123", "Radu", "Arama", 21, 0, 0),
                    new Client("124", "Vanea", "Vanea", 23, 5, 5),
                    new Client("125", "Jora", "Jora", 25, 4, 2))));

    CarEngineeringManager.getInstance().startProducingCar("123");
    CarEngineeringManager.getInstance().startProducingCar("124");
    CarEngineeringManager.getInstance().startProducingCar("125");
    CarEngineeringManager.getInstance().startProducingCar("126");
  }
}
