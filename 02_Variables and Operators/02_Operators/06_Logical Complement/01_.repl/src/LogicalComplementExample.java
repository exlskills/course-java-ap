package exlhub;

public class LogicalComplementExample {

  public static boolean exampleVariableOne = true;
  // The character '!' inverts the boolean value of exampleVariableOne
  public static boolean exampleVariableTwo = !exampleVariableOne;

  public static void main(String[] args) {
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  }
}