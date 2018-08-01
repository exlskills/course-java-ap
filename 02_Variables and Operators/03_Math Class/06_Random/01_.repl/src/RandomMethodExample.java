package exlcode;

public class RandomMethodExample {

  // Returns double value greater than or equal to 0.0 and less than 1.0
  public static double exampleVariableOne = Math.random();
  // Returns an integer value between 1 and 100
  public static int exampleVariableTwo = (int) (Math.random() * 101);

  public static void main(String[] args) {
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  }
}