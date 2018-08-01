package exlhub;

public class SelectionSortExample {

  public static void main(String[] args) {
    int[] exampleVariableOne = {17, 5, 21, 8, 19, 2, 23, 15, 4, 13};
    selectionSort(exampleVariableOne);
    System.out.println("Sorted Values: ");
    for (int val : exampleVariableOne) {
      System.out.print(val + " ");
    }
  }

  public static void selectionSort(int[] parameterOne) {
    for (int i = 0; i < parameterOne.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < parameterOne.length; j++) {
        if (parameterOne[j] < parameterOne[min]) {
          min = j;
        }
      }
      // finds the smallest value in the array and swaps it with
      // the value at index 0
      // the process continues until the array is sorted
      int temp = parameterOne[i];
      parameterOne[i] = parameterOne[min];
      parameterOne[min] = temp;
    }
  }
}