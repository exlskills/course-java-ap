package exlcode;

public class EnhancedForLoopExample {

  public static int[] exampleVariableOne = {0, 1, 2, 3, 4, 5, 6, 7, 8};
  public static int sum = 0;
  public static void main(String[] args) {
    // simplifies the for loop and creates simple code
    // 1D array
    for (int count : exampleVariableOne) {
      sum += exampleVariableOne[count];
    }
    System.out.println(sum);
  }
}