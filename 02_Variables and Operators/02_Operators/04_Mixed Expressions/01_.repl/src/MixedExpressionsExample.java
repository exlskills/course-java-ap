package exlhub;

public class MixedExpressionsExample {

  // Keep in mind that 1/3 = 0 because both 1 and 3 are integers
  public static double exampleVariableOne = ((1/3+7.5) / 2.5);
  public static int exampleVariableTwo = ((7/4 + 2/6) + 4);

  public static void main(String[] args) {
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  }
}