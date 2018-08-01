>>Which of the following throws a NullPointerException? <<

( ) A.<br />
 <code>java
Object varOne = null;
System.out.println(varOne);
</code> {{A is incorrect because it compiles and runs without any errors.}}
(x) B.<br />
 <code>java
Object varOne = null;
System.out.println(varOne.toString());
</code> {{B is correct because a null value cannot be converted into a <code>String</code>.}}
( ) C.<br />
 <code>java
Object varOne;
System.out.println(varOne);
</code> {{C is incorrect because it causes a compile-time error, not an exception.}}
( ) D.<br />
 <code>java
Object varOne;
System.out.println(varOne.toString());
</code> {{D is incorrect because it causes a compile-time error, not an exception.}}
( ) E.<br />
 <code>java
Object varOne = null;
String varTwo = varOne;
System.out.println(varTwo);
</code> {{E is incorrect because it causes a compile-time error, not an exception.}}

||Null values cannot be used as a object in a program. ||
