package exlcode;

public class InfiniteLoopExample {

  public static boolean exampleVariableOne = true;
  public static int exampleVariableTwo = 0;
  public static int counter = 0;

  public static void main(String[] args) {
    // without the if statement, the loop will be executed infinitely
    // because exampleVariableOne is always true
    while (exampleVariableOne) {
      System.out.print(exampleVariableTwo + " ");
      exampleVariableTwo++;
      // the if statement ensures that the infinite loop
      // is terminated after it runs 10 times
      if (exampleVariableTwo > 10) {
        exampleVariableOne = false;
      }
    }
  }
}