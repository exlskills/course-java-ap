package exlhub;

public class ArithmeticExceptionExample {

  public static void main(String[] args) {
    try {
      // ArithmeticException will be thrown because
      // a number cannot be divided by 0
      int exampleVariableOne = 500/0;
       System.out.println("You are not dividing a number by 0");
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception: cannot divide by 0");
    }
  }
}