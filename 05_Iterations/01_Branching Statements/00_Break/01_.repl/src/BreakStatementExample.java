package exlhub;

public class BreakStatementExample {

  public static int exampleVariableOne = 10;

  public static void main(String[] args) {
    System.out.println("Counting forward from 0-10:");
    for (int count = 0; count <= exampleVariableOne; count++) {
      System.out.print(count + " ");
      // once count is equal to 5, the break statement will
      // terminate the for loop
      if (count == 5) {
        break;
      }
    }
  }
}