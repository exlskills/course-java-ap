>>A two dimensional array, paramOne, holds integer values ranging from 1 to 10. Consider the following method:

```
public int exampleMethod(int[][] paramOne)
{
  int row;
  int column;
  int varOne;
  int max = 0;

  for(row = 0; row < paramOne.length; row++) {
    for(column = 0; column < paramOne[0].length; column++) {
      varOne = paramOne[row][column];
      if(varOne > max){
        max = varOne;
      }
    }
  }
  return max;
}
```

What does this method compute?<<

(x) The maximum value in <code>paramOne</code>. {{Correct because the method loops through all the elements of <code>paramOne</code> to determine the largest value by comparing them to <code>max</code>.}}
( ) The column with the greatest value. {{Incorrect because the method does not return the index of a column.}}
( ) The most frequent value in <code>paramOne</code>. {{Incorrect because the method does not check to see which values appear the most in <code>paramOne</code>.}}
( ) The two largest values in <code>paramOne</code>. {{Incorrect because the method only returns one integer.}}
( ) The sum of all the values in <code>paramOne</code>. {{Incorrect because the method does not have a <code>sum</code> variable that increases as the method loops through <code>paramOne</code>.}}

||The <code>for</code> loops above passes through every single element in the two-dimensional array. ||
