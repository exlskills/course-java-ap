package exlhub;

public class LongDataTypeExample {

  // long can by any integer between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807
  public static long exampleVariableOne = 2147483647;
  public static long exampleVariableTwo = 2;
  // integers bigger than 2147483647 cannot exist in the code
  // and must be parsed from a String value
  // this will be explained in Unit 8
  public static long exampleVariableThree = Long.parseLong("9223372036854775807");

  public static void main(String[] args) {
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
    System.out.println(exampleVariableThree);
  }
}