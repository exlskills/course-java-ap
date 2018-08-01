package exlcode;

public class PolymorphismExample extends PolymorphismTestOne implements PolymorphismTestTwo {

  public static void main(String[] args) {
    Object polymorphismExample = new PolymorphismExample();
    ((PolymorphismExample)polymorphismExample).print();
    ((PolymorphismExample)polymorphismExample).printGreeting();
    ((PolymorphismExample)polymorphismExample).printNumber();
  }

  // implements print method from abstract class
  public void print() {
    System.out.println("Java");
  }

  // implements printGreeting method from abstract class
  public void printGreeting() {
    System.out.println("Hello World!");
  }

  // implements printNumber method from interface
  public void printNumber() {
    System.out.println(exampleVariableOne);
  }
}