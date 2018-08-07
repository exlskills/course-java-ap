package exlcode;

public class OneDArrayLengthPractiseTwo_Solution{
  public boolean commonStartEnd(int[] paramOne, int[] paramTwo) {
    boolean varOne = (paramOne[0] == paramTwo[0]); // checks to see if the first element of the arrays are the same
    boolean varTwo = (paramOne[paramOne.length - 1] == paramTwo[paramTwo.length - 1]); // checks to see if the last element of the arrays are the same
    return varOne || varTwo; // returns true if one of these are true
  }
}