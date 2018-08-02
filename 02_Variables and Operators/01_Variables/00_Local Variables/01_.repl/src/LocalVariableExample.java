package exlcode;

public class LocalVariableExample {

  public static int exampleVariableOne = 10;
  public static int exampleVariableTwo = 6;

  public static void main(String[] args) {
    System.out.println(add(exampleVariableOne, exampleVariableTwo));
    // System.out.println(exampleVariableThree) will cause an error
    // because exampleVariableThree is a local variable
  }

  public static int add(int x, int y) {
    // this is a local variable
    int exampleVariableThree = x + y;
    return exampleVariableThree;
  }
}