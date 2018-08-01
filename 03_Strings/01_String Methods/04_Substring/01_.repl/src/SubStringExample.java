package exlhub;

public class SubStringExample {

  public static String exampleVariableOne = "Hello World!";
  // returns a String between the given indices and assigns
  // it to String variables
  public static String exampleVariableTwo = exampleVariableOne.substring(0, 5);
  public static String exampleVariableThree = exampleVariableOne.substring(6);

  public static void main(String[] args) {
    System.out.println(exampleVariableTwo);
    System.out.println(exampleVariableThree);
  }
}