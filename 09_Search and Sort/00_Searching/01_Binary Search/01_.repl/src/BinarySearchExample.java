package exlcode;

public class BinarySearchExample {

  public static void main(String[] args) {
    // the array has to be sorted before binary search
    int[] exampleVariableOne = {1, 11, 24, 34, 67, 89, 102};
    int target = 102;
    binarySearch(exampleVariableOne, target);
  }

  public static void binarySearch(int[] parameterOne, int parameterTwo) {
    int index = -1;
    int lowEnd = 0;
    int highEnd = parameterOne.length - 1;
    while (highEnd >= lowEnd) { // Difference of highEnd and lowEnd decreases as the search range narrows
      int middle = (lowEnd + highEnd) / 2;
      // checks if the middle of the lowEnd and the highEnd is the target
      if (parameterOne[middle] == parameterTwo) {
        index = middle; // the target is found
        break;
      } else if (parameterOne[middle] < parameterTwo) {
        // changes the lowEnd to narrow the search range
        lowEnd = middle + 1;
      } else if (parameterOne[middle] > parameterTwo) {
        // changes the highEnd to narrow the search range
        highEnd = middle - 1;
      }
    }
    if (index == -1) {
      System.out.println("Your target integer does not exist in the array");
    } else {
      System.out.println("Your target integer is in index " + index + " of the array");
    }
  }
}