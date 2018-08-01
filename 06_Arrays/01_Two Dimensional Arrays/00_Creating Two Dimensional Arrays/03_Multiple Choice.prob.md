>>Which of the following statements assigns the letter 'A' to the 3rd row and 1st column of the two-dimensional array? 
Note that there is no "0th column" or "0th row". <<

( ) <code>varOne[0][2] = 'A';</code> {{incorrect because <code>varOne[0][2]</code> indicates the 1st row and 3rd column.}}
( ) <code>varOne[1][3] = 'A';</code> {{incorrect because <code>varOne[1][3]</code> indicates the 2nd row and 4th column.}}
( ) <code>varOne[3][1] = 'A';</code> {{incorrect because <code>varOne[3][1]</code> indicates the 4th row and 2nd column.}}
(x) <code>varOne[2][0] = 'A';</code> {{correct because row and columns indices start at 0. Therefore, <code>varOne[2][0]</code> indicates the 3rd row and 1st column.}}
( ) <code>varOne.setValue(2,0,'A');</code> {{incorrect because there is not "setValue()" method for arrays.}}

||Rows come before columns in two-dimensional arrays. ||
