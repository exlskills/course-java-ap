package exlcode;
class IterationOneDArrayPractise_Solution{
  public int countNine(int[] paramOne) {
    int counter = 0; // stores the number of times '9' appears in the array
    for (int index = 0; index < paramOne.length; index++){
      if (paramOne[index] == 9){
        counter++;
      }
    }
    return counter;
  }
}