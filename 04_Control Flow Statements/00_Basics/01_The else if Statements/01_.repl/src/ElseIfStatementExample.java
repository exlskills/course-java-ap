package exlcode;

public class ElseIfStatementExample {

  public static int exampleVariableOne = 37;

  public static void main(String[] args) {
    // else if statements have to include boolean expressions
    if (exampleVariableOne < 10 /* expression */) {
      System.out.println("The number is smaller than 10");
    } else if (exampleVariableOne < 20 /* expression */) {
      System.out.println("The number is between 10 and 20");
    } else if (exampleVariableOne < 30 /* expression */) {
      System.out.println("The number is between 20 and 30");
    } else {
      System.out.println("The number is larger than 30");
    }
  }
}