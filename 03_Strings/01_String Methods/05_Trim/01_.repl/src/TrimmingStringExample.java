package exlhub;

public class TrimmingStringExample {

  public static String exampleVariableOne = "      Hello World!      ";
  // returns a String with leading and trailing whitespace omitted
  // and assigns it to a String variable
  public static String exampleVariableTwo = exampleVariableOne.trim();

  public static void main(String[] args) {
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  }
}