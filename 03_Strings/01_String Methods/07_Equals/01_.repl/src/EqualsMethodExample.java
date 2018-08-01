package exlcode;

public class EqualsMethodExample {

  public static String exampleVariableOne = "Ant";
  public static String exampleVariableTwo = new String("Ant");
  // tests to see if the value for both Strings are equal
  // and assigns it to boolean variables
  public static boolean exampleVariableThree = exampleVariableOne.equals(exampleVariableTwo);
  public static boolean exampleVariableFour = exampleVariableOne == exampleVariableTwo;

  public static void main(String[] args) {
    System.out.println(exampleVariableThree);
    System.out.println(exampleVariableFour);
  }
}