package exlhub;

public class CompareToMethodExample {

  public static String exampleVariableOne = "Ant";
  public static String exampleVariableTwo = "ant";
  public static String exampleVariableThree = "Butterfly";
  public static String exampleVariableFour = "Zebra";
  // compares the two Strings lexicographically and
  // assigns the difference to integer variables
  public static int exampleVariableFive = exampleVariableOne.compareTo(exampleVariableTwo);
  public static int exampleVariableSix = exampleVariableTwo.compareTo(exampleVariableOne);
  public static int exampleVariableSeven = exampleVariableThree.compareTo(exampleVariableOne);
  public static int exampleVariableEight = exampleVariableFour.compareTo(exampleVariableOne);

  public static void main(String[] args) {
    System.out.println(exampleVariableFive);
    System.out.println(exampleVariableSix);
    System.out.println(exampleVariableSeven);
    System.out.println(exampleVariableEight);
  }
}