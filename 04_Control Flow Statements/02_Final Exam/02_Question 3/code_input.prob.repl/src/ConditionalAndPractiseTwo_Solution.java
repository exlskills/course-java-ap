package exlcode;

public class ConditionalAndPractiseTwo_Solution{
  public boolean partyBalloons(int numberOfBalloons, boolean isWeekend) {
    // stores whether or not number of balloons is between 40 and 60
    boolean varOne = 40 <= numberOfBalloons && numberOfBalloons <= 60;
    // stores whether or not number of balloons is greater than 40
    boolean varTwo = 40 <= numberOfBalloons;
    if (isWeekend){
      return varTwo;
    }
    return varOne; 
  }
}