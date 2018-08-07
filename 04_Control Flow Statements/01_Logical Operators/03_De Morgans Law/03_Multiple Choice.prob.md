>>Which of the following expressions is equivalent to:
<code>!(varOne &#124;&#124; varTwo)</code> <<

( ) <code>(varOne || varTwo)</code> {{Incorrect because negating an "OR" expression does not result in the same values previously inside the parenthesis.}}
( ) <code>(varOne &amp;&amp; varTwo)</code> {{Incorrect because <code>varOne</code> and <code>varTwo</code> have to be negated as well.}}
(x) <code>(!varOne) &amp;&amp; (!varTwo)</code> {{Correct because negating an "OR" expression is the same as the "AND" expression of the individual values negated.}}
( ) <code>!(varOne &amp;&amp; varTwo)</code> {{Incorrect because <code>!(varOne &amp;&amp; varTwo)</code> is equivalent to <code>!varOne || !varTwo</code>, which is not the expression in the question.}}
( ) <code>(!varOne) || (!varTwo)</code> {{Incorrect because <code>!varOne || !varTwo</code> is equivalent to <code>!(varOne &amp;&amp; varTwo)</code>, which is not the expression in the question.}}

||The '!' operator is distributed equally to everything inside the brackets, including the conditional "AND" and the conditional "OR". ||
