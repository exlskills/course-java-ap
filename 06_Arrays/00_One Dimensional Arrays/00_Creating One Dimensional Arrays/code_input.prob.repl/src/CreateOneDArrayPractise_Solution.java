package exlcode;
public class CreateOneDArrayPractise_Solution{
  public int[] compareArr(int[] paramOne, int[] paramTwo) {
    // checks to see if paramTwo has a larger sum
    if (paramOne[0] + paramOne[1] < paramTwo[0] + paramTwo[1]){
      return paramTwo;
    }
    return paramOne; // returns paramOne if paramOne has a larger sum or if the sum for both arrays are equal
  }
}