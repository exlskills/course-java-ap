package exlcode;

public class BaseCasePractise_Solution{
  public int multipleOfTwo(int paramOne) {
    // base case
    if (paramOne == 0){
      return 0;
    }
    // adds 2 until paramOne is zero
    return 2 + multipleOfTwo(paramOne - 1);
  }
}