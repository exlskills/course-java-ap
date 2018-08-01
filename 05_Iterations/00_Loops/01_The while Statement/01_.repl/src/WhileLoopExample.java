package exlcode;

public class WhileLoopExample {

  public static int exampleVariableOne = 0;
  public static int exampleVariableTwo = 10;

  public static void main(String[] args) {
    // while loop does not end until the boolean expression
    // is false
    System.out.println("Counting forward from 0-10:");
    while (exampleVariableOne <= 10) {
      System.out.print(exampleVariableOne + " ");
      exampleVariableOne++;
    }
    System.out.println("\nCounting backward from 0-10:");
    while (exampleVariableTwo >= 0) {
      System.out.print(exampleVariableTwo + " ");
      exampleVariableTwo--;
    }
  }
}