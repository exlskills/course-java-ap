>>Which of the following expressions is equivalent to:
<code>!(varOne &#124;&#124; varTwo)</code> <<

( ) <pre><code>(varOne || varTwo)</code></pre> {{Incorrect because negating an "OR" expression does not result in the same values previously inside the parenthesis.}}
( ) <pre><code>(varOne &amp;&amp; varTwo)</code></pre> {{Incorrect because <code>varOne</code> and <code>varTwo</code> have to be negated as well.}}
(x) <pre><code>(!varOne) &amp;&amp; (!varTwo)</code></pre> {{Correct because negating an "OR" expression is the same as the "AND" expression of the individual values negated.}}
( ) <pre><code>!(varOne &amp;&amp; varTwo)</code></pre> {{Incorrect because <code>!(varOne &#38;&#38; varTwo)</code> is equivalent to <code>!varOne || !varTwo</code>, which is not the expression in the question.}}
( ) <pre><code>(!varOne) || (!varTwo)</code></pre> {{Incorrect because <code>!varOne || !varTwo</code> is equivalent to <code>!(varOne &#38;&#38; varTwo)</code>, which is not the expression in the question.}}

||The '!' operator is distributed equally to everything inside the brackets, including the conditional "AND" and the conditional "OR". ||
