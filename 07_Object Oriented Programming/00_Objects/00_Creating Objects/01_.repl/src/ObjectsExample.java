package exlhub;

public class ObjectsExample {

  public static void main(String[] args) {
    // creates a new object of the test class
    // since the constructor of the ObjectTest class takes in
    // one String parameter, "Hello World!" is inside the parentheses
    ObjectTest objectTest = new ObjectTest("Hello World!");
    objectTest.print();
  }
}