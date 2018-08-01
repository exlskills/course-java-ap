package exlhub;

public class OneDimensionalArraysExample {

  // exampleVariableOne is declared but not initialised
  public static int[] exampleVariableOne;
  public static int[] exampleVariableTwo = {0, 1, 2, 3, 4, 5, 6, 7, 8};
  public static boolean[] exampleVariableThree = {true, false, false, true};

  public static void main(String[] args) {
    // the default value for int[] elements is 0
    exampleVariableTwo[0] = 10;
    System.out.println(exampleVariableTwo[3]);
    System.out.println(exampleVariableThree[1]);

  }
}