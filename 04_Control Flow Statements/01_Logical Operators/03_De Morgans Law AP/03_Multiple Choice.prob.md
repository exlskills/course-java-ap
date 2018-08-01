>>Which of the following expressions is equivalent to:
<code>!(varOne || varTwo)</code> <<

( ) A. <code>(varOne || varTwo)</code> {{A is incorrect because negating an OR expression does not result in the same values previously inside the parenthesis.}}
( ) B. <code>(varOne &amp;&amp; varTwo)</code> {{B is incorrect because varOne and varTwo have to be negated as well.}}
(x) C. <code>(!varOne) &amp;&amp; (!varTwo)</code> {{C is correct because negating an OR expression is the same as the AND expression of the individual values negated.}}
( ) D. <code>!(varOne &amp;&amp; varTwo)</code> {{D is incorrect because <code>!(varOne &amp;&amp; varTwo) </code> is equivalent to <code>!varOne || !varTwo</code>, which is not the expression in the question.}}
( ) E. <code>(!varOne) || (!varTwo)</code> {{E is incorrect because <code>!varOne || !varTwo</code> is equivalent to <code>!(varOne &amp;&amp; varTwo) </code>, which is not the expression in the question.}}

||The '!' operator is distributed equally to everything inside the brackets, including the conditional AND and the conditional OR. ||
