package exlcode;

class ForEachLoopPractise_Solution{
  public int returnArray(int[] paramOne){
    int sum = 0;
    // loops through all the elements in varOne
    for (int index: paramOne){
      sum += index;
    }
    return sum;
  }
}