package exlhub;

public class OverrideMethodTestTwo extends OverrideMethodTestOne {

  public String exampleVariableTwo = "World";

  // overrides the print method from OverrideMethodTestOne
  public void print() {
    // calls the print method from the OverrideMethodTestOne
    super.print();
    System.out.println(exampleVariableTwo);
  }
}