package exlcode;

public class InsertionSortExample {

  public static void main(String[] args) {
    int[] exampleVariableOne = {17, 5, 21, 8, 19, 2, 23, 15, 4, 13};
    insertionSort(exampleVariableOne);
    System.out.println("Sorted Values: ");
    for (int val : exampleVariableOne) {
      System.out.print(val + " ");
    }
  }

  public static void insertionSort(int[] parameterOne) {
    for (int j = 1; j < parameterOne.length; j++) {
      int k = j;
      while (k > 0 && parameterOne[k - 1] > parameterOne[k]) {
        // looks at the array in order and moves every value
        // to where they should be starting from index 0
        int temp = parameterOne[k - 1];
        parameterOne[k - 1] = parameterOne[k];
        parameterOne[k] = temp;
        k--;
      }
    }
  }
}