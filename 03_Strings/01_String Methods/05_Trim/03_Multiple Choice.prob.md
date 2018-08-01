>>Which of the following will print the <code>String</code> "Hello"? <<

( ) A.<br />
 <code>java
String varOne = "Hello World!";
System.out.println(varOne.trim());
</code> {{A is incorrect because it prints "Hello World!".}}
( ) B.<br />
 <code>java
String varOne = " Hello Hello ";
System.out.println(varOne.trim());
</code> {{B is incorrect because it prints "Hello Hello".}}
( ) C.<br />
 <code>java
String varOne = " H e l l o ";
System.out.println(varOne.trim());
</code> {{C is incorrect because it prints "H e l l o".}}
(x) D.<br />
 <code>java
String varOne = "   Hello   ";
System.out.println(varOne.trim());
</code> {{D is correct because it prints the <code>String</code> "Hello!" without any spaces at the start and end of the <code>String</code>.}}

||The <code>trim()</code> method only removes the spaces at the start and the end of the <code>String</code>. ||
