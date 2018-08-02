package exlcode;
public class ConditionalAndPractiseOne_Solution{
  public int weirdSum(int paramOne, int paramTwo) {
    int varOne = paramOne + paramTwo;
    if (10 <= varOne && varOne <= 19){
      return 20; // returns 20 if the sum is between 10 and 19 inclusive
    } else{
      return varOne;
    }
  }
}