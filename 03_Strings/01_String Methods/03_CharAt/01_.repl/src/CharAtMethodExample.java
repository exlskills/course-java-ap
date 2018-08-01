package exlhub;

public class CharAtMethodExample {

  public static String exampleVariableOne = "Hello World!";
  // returns the character at a specific index
  // and assigns it to char variables
  public static char exampleVariableTwo = exampleVariableOne.charAt(0);
  public static char exampleVariableThree = exampleVariableOne.charAt(11);
  public static char exampleVariableFour = exampleVariableOne.charAt(6);

  public static void main(String[] args) {
    System.out.println(exampleVariableTwo);
    System.out.println(exampleVariableThree);
    System.out.println(exampleVariableFour);
  }
}