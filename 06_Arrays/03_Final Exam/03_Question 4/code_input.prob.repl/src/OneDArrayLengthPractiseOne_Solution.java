package exlcode;
public class OneDArrayLengthPractiseOne_Solution{
  public boolean firstOrLastSix(int[] paramOne) {
    int varOne = paramOne.length - 1; // varOne now holds the last index of the array
    return paramOne[0] == 6 || paramOne[varOne] == 6; // returns true if either one of these are true
  }
}