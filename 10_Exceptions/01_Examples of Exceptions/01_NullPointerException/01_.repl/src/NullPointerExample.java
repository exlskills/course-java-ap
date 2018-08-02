package exlcode;

public class NullPointerExample {

  public static void main(String[] args) {
    try {
      // NullPointerException will be thrown because
      // exampleVariableOne is being compared to a null value
      Double exampleVariableOne = new Double(Math.PI);
      Double exampleVariableTwo = null;
      exampleVariableOne.compareTo(exampleVariableTwo);
      System.out.println("None of the objects are null");
    } catch (NullPointerException e) {
      System.out.println("exampleVariableOne cannot be compared to a null value");
    }
  }
}