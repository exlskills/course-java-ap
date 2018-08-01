package exlhub;

public class CastingExample {

  // this converts 15.23 into an integer
  public static int exampleVariableOne = (int) 15.23;
  public static double exampleVariableTwo = exampleVariableOne;

  public static void main(String[] args) {
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  }
}