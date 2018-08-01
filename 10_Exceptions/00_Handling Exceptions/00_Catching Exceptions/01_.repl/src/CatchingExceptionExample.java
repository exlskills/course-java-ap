package exlhub;

public class CatchingExceptionExample {

  public static void main(String[] args) {
    try {
      // NumberFormatException will be thrown because a String
      //  with characters cannot be converted into an integer value
      String exampleVariableOne = "Hello World!";
      int exampleVariableTwo = Integer.parseInt(exampleVariableOne);
    } catch (NumberFormatException e) { // the character 'e' is commonly used, but you are free to name it whatever
      // If a NumberFormatException is thrown, the program
      // will print "Number Format Exception"
      System.out.println("Number Format Exception");
    }
  }
}