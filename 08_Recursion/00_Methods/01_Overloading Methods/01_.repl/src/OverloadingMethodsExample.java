package exlcode;

public class OverloadingMethodsExample {

  public static float exampleVariableOne = 3.14f;
  public static double exampleVariableTwo = Math.PI;

  public static void main(String[] args) {
    print(exampleVariableOne);
    print(exampleVariableTwo);
  }

  // two identical methods with different parameters
  // takes in float value as a parameter
  public static void print(float parameterOne) {
    System.out.println("float: " + parameterOne);
  }
  // takes in a double value as a parameter
  public static void print(double parameterOne) {
    System.out.println("double: " + parameterOne);
  }
}