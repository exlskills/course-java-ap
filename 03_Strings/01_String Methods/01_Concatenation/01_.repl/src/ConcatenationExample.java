package exlcode;

public class ConcatenationExample {

  public static String exampleVariableOne = "Hello ";
  public static String exampleVariableTwo = "World!";
  // returns a String that concatenates exampleVariableTwo to
  // exampleVariableOne and assigns it to String variables
  public static String exampleVariableThree = exampleVariableOne + exampleVariableTwo;
  public static String exampleVariableFour = exampleVariableOne.concat(exampleVariableTwo);

  public static void main(String[] args) {
    System.out.println(exampleVariableThree);
    System.out.println(exampleVariableFour);
  }
}