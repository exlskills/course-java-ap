package exlcode;

public class ShortCircuitPractise_Solution{
  public boolean isTeenager(int ageOne, int ageTwo, int ageThree) {
    return (ageOne >= 13 && ageOne <= 19) || (ageTwo >= 13 && ageTwo <= 19) || (ageThree >= 13 && ageThree <= 19);
  }
}