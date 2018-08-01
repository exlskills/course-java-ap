package exlcode;


public class ObjectEqualityExample {

  public static void main(String[] args) {
    ObjectEqualityTest objectEqualityTest = new ObjectEqualityTest("Java");
    ObjectEqualityTest objectEqualityTestOne = new ObjectEqualityTest("Java");
    ObjectEqualityTest objectEqualityTestTwo = objectEqualityTestOne;
    // checks to see if the reference for the objects are the same
    boolean exampleVariableOne = objectEqualityTest.equals(objectEqualityTestOne);
    boolean exampleVariableTwo = objectEqualityTestOne.equals(objectEqualityTestTwo);
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  }
}