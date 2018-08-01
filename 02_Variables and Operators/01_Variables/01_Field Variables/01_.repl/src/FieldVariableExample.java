package exlhub;

public class FieldVariableExample {

  // these are field variables
  public static int exampleVariableOne = 10;
  public static int exampleVariableTwo = 6;

  public static void main(String[] args) {
    System.out.println(add(exampleVariableOne, exampleVariableTwo));
    multiply();
  }

  public static int add(int x, int y) {
    // this is a local variable
    int exampleVariableThree = x + y;
    return exampleVariableThree;
  }

  public static void multiply() {
    System.out.println(exampleVariableOne * exampleVariableTwo);
  }
}