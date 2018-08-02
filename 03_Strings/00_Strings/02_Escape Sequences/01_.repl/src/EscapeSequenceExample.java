package exlcode;

public class EscapeSequenceExample {

  public static void main(String[] args) {
    // without the second backslash, a syntax error will occur
    System.out.println("\\");
    // without the backslash, a syntax error will occur
    System.out.println("\"Hello World!\"");
    // \n prints "Java" on a new line
    System.out.println("Hello World!" + "\nJava");
  }
}