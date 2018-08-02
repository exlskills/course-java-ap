package exlcode;

public class ShortCircuitEvaluationExample {

  public static boolean exampleVariableOne = true;
  public static boolean exampleVariableTwo = false;
  public static int exampleVariableThree = 5;
  public static int exampleVariableFour = 0;

  public static void main(String[] args) {
    // does not evaluate "0 == 5/0" because the result will always be true
    // as long as exampleVariableOne is true
    if (exampleVariableOne || 0 == exampleVariableThree/exampleVariableFour) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
    // does not evaluate "0 == 5/0" because the result will always be false
    // as long as exampleVariableTwo is false
    if (exampleVariableTwo && 0 == exampleVariableThree/exampleVariableFour) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
  }
}