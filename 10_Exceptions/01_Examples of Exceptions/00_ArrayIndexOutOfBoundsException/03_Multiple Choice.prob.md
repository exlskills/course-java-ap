>>Which of the following throws an ArrayIndexOutOfBoundsException? <<

( ) <code>int[] varOne = new int[5]<br/>System.out.println(varOne[4]);</code> {{Incorrect because it compiles and runs without any errors.}}
(x)<code>int[] varOne = new int[5]<br/>System.out.println(varOne[5]);</code> {{Correct because index 5 does not exist in <code>varOne</code>.}}
( )<code>int[] varOne;<br/>System.out.println(varOne[4]);</code> {{Incorrect because it causes a compile-time error, not an exception.}}
( )<code>int[] varOne = {1,2,3,4,5,5};<br/>System.out.println(varOne[5]);</code> {{Incorrect because it compiles and runs without any errors.}}
( )<code>int[] varOne = {1,2,3,4,5};<br/>System.out.println(varOne[3+varOne[0]]);</code> {{Incorrect because it compiles and runs without any errors.}}

||The last index of an array is always <code>array.length - 1</code>. ||
