package exlhub;

public class LoopVariableExample {

  public static int exampleVariableOne = 10;
  public static int counterOne = 0;

  public static void main(String[] args) {
    System.out.println("Counting forward from 0-10:");
    // counterOne is the loop variable
    while (exampleVariableOne >= counterOne) {
      System.out.print(counterOne + " ");
      counterOne++;
    }
    System.out.println("\nCounting backward from 0-10:");
    //  "counterTwo" is the loop variable
    for (int counterTwo = exampleVariableOne; counterTwo >= 0; counterTwo--) {
      System.out.print(counterTwo + " ");
    }
    // The following statement will cause a runtime error:
    // System.out.println(counterTwo);
  }
}