package exlhub;

public class ArrayIndexOutOfBoundsExample {

  public static int[] exampleVariableOne = new int[10];

  public static void main(String[] args) {
    try {
      // ArrayIndexOutOfBoundsException will be thrown because
      // exampleVariableOne only has a length of 10
      exampleVariableOne[11] = 9;
      System.out.println("Array index is valid");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index is out of bounds");
    }
  }
}