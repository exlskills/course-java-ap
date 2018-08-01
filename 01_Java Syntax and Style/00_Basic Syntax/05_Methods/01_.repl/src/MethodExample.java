package exlhub;

public class MethodExample {

  public static int exampleVariableOne = 5;
  public static int exampleVariableTwo = 10;

  public static void main(String[] args) {
    // this prints the sum of exampleVariableOne and exampleVariableTwo
    System.out.println(add(exampleVariableOne, exampleVariableTwo));
  }

  // this method takes in two parameters and
  // returns the sum of the two parameters
  public static int add(int parameterOne, int parameterTwo) {
    return parameterOne + parameterTwo;
  }
}