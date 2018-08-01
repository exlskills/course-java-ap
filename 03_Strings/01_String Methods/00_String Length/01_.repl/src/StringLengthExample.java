package exlhub;

public class StringLengthExample {

  public static String exampleVariableOne = "Hello World!";
  public static String exampleVariableTwo = "";
  // returns the length of exampleVariableOne and exampleVariableTwo
  // and assigns it to lengthOne and lengthTwo
  public static int lengthOne = exampleVariableOne.length();
  public static int lengthTwo = exampleVariableTwo.length();

  public static void main(String[] args) {
    System.out.println(lengthOne);
    System.out.println(lengthTwo);
  }
}