package exlcode;
public class ForStatementPractise_Solution{
  public boolean checkE(String paramOne) {
    int counter = 0;
    paramOne = paramOne.toLowerCase();
    for (int index = 0; index < paramOne.length(); index++){
      if (paramOne.charAt(index) == 'e'){
        counter++; // adds 1 to the counter every time String contains an 'e'
      }
    }
    return (counter >= 1 && counter <= 3); // returns true if the number of `char` 'e' is between 1 and 3
  }
}