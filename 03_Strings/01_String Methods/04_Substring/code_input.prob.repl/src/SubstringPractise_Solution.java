package exlcode;

public class SubstringPractise_Solution{
  public String removeStartEnd(String varOne) {
    // returns the substring between the 1st index (inclusive) and the last index.
    return varOne.substring(1, varOne.length() - 1);
  }
}