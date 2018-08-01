package exlcode;

public class IndexOfMethodExample {

  public static String exampleVariableOne = "Hello World!";
  // returns the index of the given String (case sensitive)
  // and assigns it to integer variables
  public static int exampleVariableTwo = exampleVariableOne.indexOf("World");
  public static int exampleVariableThree = exampleVariableOne.indexOf("world");
  public static int exampleVariableFour = exampleVariableOne.indexOf("world", 7);

  public static void main(String[] args) {
    System.out.println(exampleVariableTwo);
    System.out.println(exampleVariableThree);
    System.out.println(exampleVariableFour);
  }
}