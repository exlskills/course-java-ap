package exlcode;

public class DotNotationExample {

  public static void main(String[] args) {
    DotNotationTest dotNotationTest = new DotNotationTest();
    // any public variable or method in DotNotationTest can be
    // accessed through dot notation
    System.out.println(dotNotationTest.exampleVariableOne);
    System.out.println(dotNotationTest.exampleVariableTwo);
    dotNotationTest.print();
  }
}