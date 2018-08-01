package exlhub;

// class names are written in UpperCamelCase
// class names are usually nouns or noun phrases.
public class NamingConventionsExample {

  // constant names are written with all upper case
  // letters with words separated by underscores
  public static final int EXAMPLE_VARIABLE_ONE = 10;
  // non-constant field names are written with lowerCamelCase
  // variable names must be specific and meaningful
  public static int exampleVariableTwo = 5;
  // names like "string1, myarray1, no_1" are not acceptable
  // as variable names because they are are not specific
  // and can cause confusion like the variable below:
  public static String string = "String";

  public static void main(String[] args) {
    // local variable names are written in lowerCamelCase
    int exampleVariableThree = 15;
    printGreeting("Hello World!");
  }

  // method names are written in lowerCamelCase
  // method names are usually verbs or verb phrase
  // parameters names are written in lowerCamelCase
  public static void printGreeting(String parameterOne){
    System.out.println(parameterOne);
  }
}