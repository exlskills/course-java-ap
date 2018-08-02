package exlcode;
public class IfElsePractise_Solution{
  public int numberSum(int paramOne, int paramTwo) {
    // Store the sum in a local variable
    int varOne = paramOne + paramTwo;
  
    // Double varOne if paramOne and paramTwo are the same
    if (paramOne == paramTwo) {
      varOne *= 2;
    }
  
    // return the sum
    return varOne;
  }
}