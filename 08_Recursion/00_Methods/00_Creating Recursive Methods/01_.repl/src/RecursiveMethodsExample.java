package exlhub;

public class RecursiveMethodsExample {

  public static void main(String[] args) {
    // prints 1-10 in descending order
    print(10);
  }

  public static void print(int parameterOne) {
    if (parameterOne > 0) {
      System.out.print(parameterOne + " ");
      parameterOne--;
      // recursive call
      print(parameterOne);
    }
  }
}