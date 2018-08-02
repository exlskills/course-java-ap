package exlcode;
public class RelationalOperatorPractiseTwo_Solution{
  public boolean multipleOfThree(int paramOne) {
    // modulus operator returns remainder between paramOne and 3
    // if the remainder is 0, paramOne is a multiple 3 and the method returns true
    return (paramOne % 3 == 0);
  }
}