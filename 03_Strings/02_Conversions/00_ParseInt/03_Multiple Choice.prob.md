>>Which of the statements below is correct? <<

( ) <pre><code>String varOne = parseInt(3);</code></pre> {{Incorrect because the input of the <code>parseInt()</code> method is not a <code>String</code>.}}
( ) <pre><code>int varOne = parseInt("222" + "A");</code></pre> {{Incorrect because the input <code>String</code> consists of digits and letters.}}
(x)  <pre><code>int varOne = Integer.parseInt("222");</code></pre> {{Correct because it correctly parses the <code>String</code> "222" into the integer value 222. The input can only consists of digits.}}
( ) <pre><code>int varOne = Int.parseInt("222");</code></pre> {{Incorrect because the class "Int" does not exist.}}
( ) <pre><code>int varOne = parseInt("Hello");</code></pre> {{Incorrect because the input <code>String</code> does not include digits.}}

||The <code>parseInt()</code> method cannot parse text into integers. ||
