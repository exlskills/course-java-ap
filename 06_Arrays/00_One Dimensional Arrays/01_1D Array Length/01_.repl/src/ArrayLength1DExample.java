package exlcode;

public class ArrayLength1DExample {

  public static int[] exampleVariableOne = new int[5];
  public static int[] exampleVariableTwo = {0, 1, 2, 3, 4, 5, 6, 7, 8};
  // returns the length of the array and assigns
  // it to integer variables
  public static int lengthOne = exampleVariableOne.length;
  public static int lengthTwo = exampleVariableTwo.length;

  public static void main(String[] args) {
    System.out.println(lengthOne);
    System.out.println(lengthTwo);
  }
}