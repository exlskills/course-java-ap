package exlcode;

public class ParseIntExample {

  public static String exampleVariableOne = "5666";
  public static String exampleVariableTwo = "423";
  public static int exampleVariableThree = Integer.parseInt(exampleVariableOne);
  public static int exampleVariableFour = Integer.parseInt(exampleVariableTwo);

  public static void main(String[] args) {
    System.out.println("Integer exampleVariable of exampleVariableOne is " + exampleVariableThree);
    System.out.println("Integer exampleVariable of exampleVariableTwo is " + exampleVariableFour);
  }
}