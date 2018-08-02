package exlcode;
public class RecursionPractise_Solution{
  public int powerOfNum(int paramOne, int paramTwo) {
    // base case 
    if (paramTwo == 0){
      return 1;
    }
    // multiplies paramOne until paramTwo is equal to zero
    return paramOne * powerOfNum(paramOne, paramTwo - 1);
  }
}