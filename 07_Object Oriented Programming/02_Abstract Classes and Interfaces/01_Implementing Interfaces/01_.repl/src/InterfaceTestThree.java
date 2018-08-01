package exlcode;

public class InterfaceTestThree implements InterfaceTestOne, InterfaceTestTwo {

  // implements the method print() from InterfaceTestOne
  public void print() {
    System.out.println(exampleVariableOne);
  }

  // implements the method printGreeting() from InterfaceTestOne
  public void printGreeting() {
    System.out.println(exampleVariableTwo);
  }
}