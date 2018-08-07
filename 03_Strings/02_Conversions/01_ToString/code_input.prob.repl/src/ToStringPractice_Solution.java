package exlcode;

public class ToStringPractice_Solution{
  public boolean detectOne(int paramOne) {
    // converts paramOne to a String and assigns it to varOne
    String varOne = Integer.toString(paramOne);
    // returns whether or not the character '1' exists in the String
    return varOne.indexOf('1') != -1; 
  }
}