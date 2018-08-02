package exlcode;

public class ReturnStatementExample {

  public static int exampleVariableOne = 100;

  public static void main(String[] args) {
    System.out.println(count());
  }

  public static String count() {
    while (exampleVariableOne > 0) {
      if (exampleVariableOne == 25) {
        return "exampleVariableOne is 25";
      }
      exampleVariableOne--;
    }
    // returns the statement below if exampleVariableOne
    // is never equal to 25
    return "exampleVariableOne is never equal to 25";
  }
}