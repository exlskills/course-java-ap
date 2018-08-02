>>Which of the following throws a NullPointerException? <<

( )<code> Object varOne = null; System.out.println(varOne); </code> {{Incorrect because it compiles and runs without any errors.}}
(x)<code> Object varOne = null; System.out.println(varOne.toString()); </code> {{Correct because a null value cannot be converted into a <code>String</code>.}}
( )<code> Object varOne; System.out.println(varOne); </code>{{Incorrect because it causes a compile-time error, not an exception.}}
( )<code> Object varOne; System.out.println(varOne.toString()); </code>{{Incorrect because it causes a compile-time error, not an exception.}}
( )<code> Object varOne = null; String varTwo = varOne; System.out.println(varTwo); </code>{{Incorrect because it causes a compile-time error, not an exception.}}

||Null values cannot be used as a object in a program. ||
