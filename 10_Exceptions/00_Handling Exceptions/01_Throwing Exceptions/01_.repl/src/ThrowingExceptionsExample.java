package exlcode;

public class ThrowingExceptionsExample {

  public static int exampleVariableOne = 1;
  public static int exampleVariableTwo = 12;

  public static void main(String[] args){
    add(exampleVariableOne, exampleVariableTwo);
  }

  public static void add(int exampleVariableOne, int exampleVariableTwo) throws ArithmeticException, NumberFormatException {
    // creates a new ArithmeticException condition where
    // exampleVariableOne and exampleVariableTwo cannot be 0
    if (exampleVariableOne == 0 || exampleVariableTwo == 0) {
      throw new ArithmeticException("One of the exampleVariables are 0");
    } else {
      System.out.println("The sum of the two numbers: " + (exampleVariableOne + exampleVariableTwo));
    }
  }
}