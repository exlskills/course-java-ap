package exlcode;
public class ConditionalOrPractise_Solution{
  public int luckyNumbers(int paramOne, int paramTwo, int paramThree) {
    // checks whether or not all three parameters have the same value
    if (paramOne == paramTwo  && paramTwo == paramThree){
      return 20;
    }
    // checks if 2 parameters have the same value
    if (paramOne == paramTwo || paramOne == paramThree || paramTwo == paramThree){
      return 10;
    }
    return 0; // return 0 if all three numbers have different values
  }
}