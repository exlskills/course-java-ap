package exlhub;

public class ConstantsExample {

  // variable names for constants are capitalized and separated by underscores
  public static final int EXAMPLE_VARIABLE_ONE = 1;
  public static final double EXAMPLE_VARIABLE_TWO = 3.5;

  public static void main(String[] args) {
    // EXAMPLE_VARIABLE_1 + 1 will cause an error because
    // EXAMPLE_VARIABLE_1 is declared final
    System.out.println(EXAMPLE_VARIABLE_ONE);
    System.out.println(EXAMPLE_VARIABLE_TWO);
  }
}