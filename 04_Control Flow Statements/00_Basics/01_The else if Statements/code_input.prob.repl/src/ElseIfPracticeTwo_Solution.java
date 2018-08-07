package exlcode;

public class ElseIfPracticeTwo_Solution{
  public int closeToTen(int paramOne, int paramTwo) {
    int varOne = Math.abs(paramOne - 10);
    int varTwo = Math.abs(paramTwo - 10);
  
    if (varOne < varTwo) {
      return paramOne; // returns paramOne if paramOne is closer to 10 than paramTwo
    }
    else if (varTwo < varOne) {
      return paramTwo; // returns paramTwo if paramTwo is closer to 10 than paramOne
    }
    else {
      return 0;  // returns 0 if varOne == varTwo
    }
  }
} 