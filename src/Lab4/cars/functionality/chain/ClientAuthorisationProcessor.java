package Lab4.cars.functionality.chain;

import Lab4.cars.data.clients.Client;

public abstract class ClientAuthorisationProcessor {
  public ClientAuthorisationProcessor nextProcessor;

  public ClientAuthorisationProcessor(ClientAuthorisationProcessor nextProcessor) {
    this.nextProcessor = nextProcessor;
  }

  public abstract boolean isAuthorized(Client client);
}
