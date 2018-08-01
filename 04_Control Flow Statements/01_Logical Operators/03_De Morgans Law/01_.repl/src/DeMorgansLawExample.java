package exlhub;

public class DeMorgansLawExample {
  
  public static boolean exampleVariableOne = true;
  public static boolean exampleVariableTwo = false;

  public static void main(String[] args) {
    // The two boolean expressions below are equal
    if (!(exampleVariableOne && exampleVariableTwo)) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
    if (!exampleVariableOne || !exampleVariableTwo) {
      System.out.println("The boolean expression is true");
    } else {
      System.out.println("The boolean expression is false");
    }
  }
}