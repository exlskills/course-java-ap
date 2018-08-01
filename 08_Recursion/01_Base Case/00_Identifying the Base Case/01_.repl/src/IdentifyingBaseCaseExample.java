package exlhub;

public class IdentifyingBaseCaseExample {

  public static int exampleVariableOne = 10;

  public static void main(String[] args) {
    System.out.println(factorial(3));
  }

  public static int factorial(int parameterOne) {
    int result;
    // base case
    // returns 1 when exampleVariableTwo = 1
    if (parameterOne == 1) {
      return 1;
    }
    // calls factorial with exampleVariableTwo - 1
    // and multiplies the current value of exampleVariableTwo
    // with the result of the factorial(exampleVariableTwo - 1)
    result = factorial(parameterOne - 1) * parameterOne;
    return result;
  }
}