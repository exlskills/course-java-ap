>>Which of the following statements is an example of short circuit? <<

(x) A. <code>13 &lt; 5 &amp;&amp; 19 / 0 == 0</code> {{A is correct because the first boolean expression <code>13 &lt; 5</code> is false, meaning that the second boolean expression does not have to be evaluated. Therefore, even though <code>19 / 0 == 0</code> should cause an error, the expression is never evaluated so the error is never caught.}}
( ) B. <code>5 &lt; 13 &amp;&amp; 19 &gt; 1</code> {{B is incorrect because the first boolean expression <code>5 &lt; 13</code> is true, meaning that the second boolean expression also has to be evaluated.}}
( ) C. <code>3 &lt; 8 &amp;&amp; -4 &lt; -4</code> {{C is incorrect because the first boolean expression <code>3 &lt; 8</code> is true, meaning that the second boolean expression also has to be evaluated.}}
( ) D. <code>7 == 12 || 10 &lt; 16</code> {{D is incorrect because the OR statement requires both boolean expressions to be evaluated if and only if the first boolean expression is false.}}
( ) E. All of the above {{E is incorrect because only {{0.title}} shows an example of short circuit.}}

||Note that "False &amp;&amp; True/False" is always false and "True || True/False" is always true. ||
