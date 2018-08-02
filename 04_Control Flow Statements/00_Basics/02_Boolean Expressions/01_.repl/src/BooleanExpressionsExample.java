package exlcode;

public class BooleanExpressionsExample {

  public static boolean exampleVariableOne = true;
  public static boolean exampleVariableTwo = false;

  public static void main(String[] args) {
    if (exampleVariableOne == exampleVariableTwo) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
    // "!=" is the opposite of equals
    if (exampleVariableOne != exampleVariableTwo) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
  }
}