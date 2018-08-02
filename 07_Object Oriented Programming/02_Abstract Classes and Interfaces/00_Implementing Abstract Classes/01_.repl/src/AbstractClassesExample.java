package exlcode;


public class AbstractClassesExample extends AbstractClassTest {

  public static void main(String[] args) {
    AbstractClassesExample abstractClassesExample = new AbstractClassesExample();
    abstractClassesExample.print();
    abstractClassesExample.printGreeting();
  }

  // implements the abstract method print()
  public void print() {
    System.out.println("Java World");
  }

  // implements the abstract method printGreeting()
  public void printGreeting() {
    System.out.println("Hello World!");
  }
}