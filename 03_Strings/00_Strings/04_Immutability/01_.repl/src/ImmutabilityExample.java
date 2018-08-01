package exlcode;

public class ImmutabilityExample {

  // exampleVariableOne holds the reference to the String "Hello World!"
  public static String exampleVariableOne = "Hello World!";

  public static void main(String[] args) {
    // the String reference for exampleVariableOne changes to the String "Java"
    exampleVariableOne = "Java";
    System.out.println(exampleVariableOne);
  }
}