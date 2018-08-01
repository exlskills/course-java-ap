package exlhub;

public class ToStringExample {

  public static int exampleVariableOne = 11;
  public static double exampleVariableTwo = Math.PI;
  public static String exampleVariableThree = Integer.toString(exampleVariableOne);
  public static String exampleVariableFour = Double.toString(exampleVariableTwo);

  public static void main(String[] args) {
    System.out.println(exampleVariableThree);
    System.out.println(exampleVariableFour);
  }
}