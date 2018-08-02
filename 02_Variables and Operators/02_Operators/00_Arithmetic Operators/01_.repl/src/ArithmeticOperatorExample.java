package exlcode;

public class ArithmeticOperatorExample {

  public static int exampleVariableOne = 15;
  public static int exampleVariableTwo = 2;
  public static int exampleVariableFive = exampleVariableOne + exampleVariableTwo;
  public static int exampleVariableSix = exampleVariableOne - exampleVariableTwo;
  public static int exampleVariableSeven = exampleVariableOne * exampleVariableTwo;
  public static int exampleVariableEight = exampleVariableOne / exampleVariableTwo;
  public static int exampleVariableNine = exampleVariableOne % exampleVariableTwo;

  public static void main(String[] args) {
    System.out.println(exampleVariableFive);
    System.out.println(exampleVariableSix);
    System.out.println(exampleVariableSeven);
    // This will not print 7.5 because exampleVariableEight is an integer
    System.out.println(exampleVariableEight);
    System.out.println(exampleVariableNine);
  }
}