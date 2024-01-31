package Lab4.cars.functionality.chain;

public class ChainGenerator {
  public static ClientAuthorisationProcessor generateChain() {
    ClientAuthorisationProcessor accidentProcessor = new ClientAccidentsCheck(null);
    ClientAuthorisationProcessor violationProcessor =
        new ClientTrafficViolationsCheck(accidentProcessor);
    return new ClientSearcher(violationProcessor);
  }
}
