>>Which of the following statements assigns the letter 'A' to the 3rd row and 1st column of the two-dimensional array? 
Note that there is no "0th column" or "0th row". <<

( ) <pre><code>varOne[0][2] = 'A';</code></pre> {{Incorrect because <code>varOne[0][2]</code> indicates the 1st row and 3rd column.}}
( ) <pre><code>varOne[1][3] = 'A';</code></pre> {{Incorrect because <code>varOne[1][3]</code> indicates the 2nd row and 4th column.}}
( ) <pre><code>varOne[3][1] = 'A';</code></pre> {{Incorrect because <code>varOne[3][1]</code> indicates the 4th row and 2nd column.}}
(x) <pre><code>varOne[2][0] = 'A';</code></pre> {{Correct because row and columns indices start at 0. Therefore, <code>varOne[2][0]</code> indicates the 3rd row and 1st column.}}
( ) <pre><code>varOne.setValue(2,0,'A');</code></pre> {{Incorrect because there is not "setValue()" method for arrays.}}

||Rows come before columns in two-dimensional arrays. ||
