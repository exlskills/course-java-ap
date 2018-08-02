package exlcode;

public class IfElseStatementExample {

  public static boolean rain = true;

  public static void main(String[] args) {
    // "== true" can be omitted simplify code
    if (rain == true /* expression */) {
      // "true branch"
      System.out.println("Use your umbrella");
    } else {
      // "false branch"
      System.out.println("Don't use your umbrella");
    }
  }
}