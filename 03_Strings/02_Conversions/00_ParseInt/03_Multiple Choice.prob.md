>>Which of the statements below is correct? <<

( ) A. <code>String varOne = parseInt(3);</code> {{A is incorrect because the input of the <code>parseInt()</code> method is not a <code>String</code>.}}
( ) B. <code>int varOne = parseInt("222" + "A");</code> {{B is incorrect because the input <code>String</code> consists of digits and letters.}}
(x) C. <code>int varOne = Integer.parseInt("222");</code> {{C is correct because it correctly parses the <code>String</code> "222" into the integer value 222. The input can only consists of digits.}}
( ) D. <code>int varOne = Int.parseInt("222");</code> {{D is incorrect because the class "Int" does not exist.}}
( ) E. <code>int varOne = parseInt("Hello");</code> {{E is incorrect because the input <code>String</code> does not include digits.}}

||The <code>parseInt()</code> method cannot parse text into integers. ||
