>>Which of the statements below is correct? <<

( ) <code>String varOne = parseInt(3);</code> {{Incorrect because the input of the <code>parseInt()</code> method is not a <code>String</code>.}}
( ) <code>int varOne = parseInt("222" + "A");</code> {{Incorrect because the input <code>String</code> consists of digits and letters.}}
(x)  <code>int varOne = Integer.parseInt("222");</code> {{Correct because it correctly parses the <code>String</code> "222" into the integer value 222. The input can only consists of digits.}}
( ) <code>int varOne = Int.parseInt("222");</code> {{Incorrect because the class "Int" does not exist.}}
( ) <code>int varOne = parseInt("Hello");</code> {{Incorrect because the input <code>String</code> does not include digits.}}

||The <code>parseInt()</code> method cannot parse text into integers. ||
