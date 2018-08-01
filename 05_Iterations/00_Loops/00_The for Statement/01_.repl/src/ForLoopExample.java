package exlhub;

public class ForLoopExample {

  public static int exampleVariableOne = 10;
  public static void main(String[] args) {
    System.out.println("Counting forward from 0-10:");
    // increments countOne by 1 and runs until the boolean expression is false
    for (int countOne = 0; countOne <= exampleVariableOne; countOne++) {
      System.out.print(countOne + " ");
    }
    System.out.println("\nCounting backward from 0-10:");
    // decrements countTwo by 1 and runs until the boolean expression is false
    for (int countTwo = exampleVariableOne; countTwo >= 0; countTwo--) {
      System.out.print(countTwo + " ");
    }
  }
}