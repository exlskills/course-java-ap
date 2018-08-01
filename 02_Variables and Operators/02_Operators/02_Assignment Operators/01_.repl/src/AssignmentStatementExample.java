package exlhub;

public class AssignmentStatementExample {

  public static int exampleVariableOne = 10;
  public static int exampleVariableTwo = 50;

  public static void main(String[] args) {
    exampleVariableOne = exampleVariableOne + exampleVariableTwo;
    exampleVariableTwo += 5;
    exampleVariableTwo -= 2;
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  }
}