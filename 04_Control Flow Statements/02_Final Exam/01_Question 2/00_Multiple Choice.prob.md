>>Which of the following statements is an example of short circuit? <<

(x) <code>13 &lt; 5 &amp;&amp; 19 / 0 == 0</code> {{Correct because the first boolean expression <code>13 &lt; 5</code> is false, meaning that the second boolean expression does not have to be evaluated. Therefore, even though <code>19 / 0 == 0</code> should cause an error, the expression is never evaluated, meaning the error is never caught.}}
( ) <code>5 &lt; 13 &amp;&amp; 19 &gt; 1</code> {{Incorrect because the first boolean expression <code>5 &lt; 13</code> is true, meaning that the second boolean expression also has to be evaluated.}}
( ) <code>3 &lt; 8 &amp;&amp; -4 &lt; -4</code> {{Incorrect because the first boolean expression <code>3 &lt; 8</code> is true, meaning that the second boolean expression also has to be evaluated.}}
( ) <code>7 == 12 || 10 &lt; 16</code> {{Incorrect because the "OR" statement requires both boolean expressions to be evaluated if and only if the first boolean expression is false.}}
( ) All of the above {{Incorrect because only the first answer choice shows an example of short circuit.}}

||Note that "False &amp;&amp; True/False" is always false and "True || True/False" is always true. ||