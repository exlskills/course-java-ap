package exlcode;

public class Iteration1DExample {

  public static int[] exampleVariableOne = {0, 1, 2, 3, 4, 5, 6, 7, 8};
  public static int sum = 0;

  public static void main(String[] args) {
    // for loops are the most common method when
    // iterating through an 1D array
    for (int count = 0; count < exampleVariableOne.length; count++) {
      // add each element to sum
      sum += exampleVariableOne[count];
    }
    // print the total sum of all the elements in the array
    System.out.println(sum);
  }
}