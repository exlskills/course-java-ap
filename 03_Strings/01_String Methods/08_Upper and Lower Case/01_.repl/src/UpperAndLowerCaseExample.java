package exlcode;

public class UpperAndLowerCaseExample {

  public static String exampleVariableOne = "Hello World!";
  // returns String with "Hello World!" either fully upper case
  // or fully lower case and assigns it to String variables
  public static String exampleVariableTwo = exampleVariableOne.toUpperCase();
  public static String exampleVariableThree = exampleVariableOne.toLowerCase();

  public static void main(String[] args) {
    System.out.println(exampleVariableTwo);
    System.out.println(exampleVariableThree);
  }
}