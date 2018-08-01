package exlhub;

public class EncapsulationTest {

  private String exampleVariableOne = "Hello World!";

  // private variables can be accessible through
  // public methods
  public String getVariableOne() {
    return exampleVariableOne;
  }
}