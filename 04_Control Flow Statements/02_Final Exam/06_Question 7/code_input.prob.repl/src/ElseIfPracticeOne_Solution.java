package exlcode;

public class ElseIfPracticeOne_Solution{
  public int totalSum(int paramOne, int paramTwo, int paramThree) {
    if (paramOne == 13){
      return 0; // none of the numbers count towards the sum if paramOne is 13.
    } else if (paramTwo == 13){
      return paramOne; // only paramOne count towards the sum if paramTwo is 13.
    } else if (paramThree == 13){
      return paramOne + paramTwo; // paramOne and paramTwo count towards the sum if paramThree is 13.
    } else {
      // if none of the numbers are equal to 13, all three integers count towards the sum
      return paramOne + paramTwo + paramThree; 
    }
  }
}