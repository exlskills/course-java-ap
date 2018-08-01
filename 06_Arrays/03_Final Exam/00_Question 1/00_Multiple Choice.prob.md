>>Which of the following will create a two-dimensional array with 4 rows and 3 columns? <<

( ) <code>int[4][3] varOne;</code> {{incorrect because the dimensions of an array are specified when the array is initialized with <code>new</code>, not when it is declared.}}
( ) <code>int[][] varOne = new int[3][4];</code> {{incorrect because the first dimension in a two-dimensional array is the number of rows, and the second dimension is the number of columns.}}
( ) <code>int[4][3] varOne = new int();</code> {{incorrect because the dimensions of an array are specified when the array is initialized with <code>new</code>, not when it is declared. Also, square brackets are used instead of parenthesis when initializing an array.}}
( ) <code>int[][] varOne; varOne.length = 4; varOne[0].length = 3;</code> {{incorrect because the length property is used to return the length of the array, not to set it.}}
(x) <code>int[][] varOne = new int[4][3];</code> {{correct because a two dimensional array must then be initialized with the reserved word <code>new</code>, followed by the type and the dimensions of the array.}}

||Rows come before columns when declaring an initialising a two-dimensional array. ||
